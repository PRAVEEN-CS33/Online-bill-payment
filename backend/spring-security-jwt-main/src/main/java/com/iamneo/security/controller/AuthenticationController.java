
package com.iamneo.security.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iamneo.security.dto.request.AuthenticationRequest;
import com.iamneo.security.dto.request.RegisterRequest;
import com.iamneo.security.dto.response.AuthenticationResponse;
import com.iamneo.security.dto.response.ErrorResponse;
import com.iamneo.security.entity.Bill;
import com.iamneo.security.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    @Autowired
    private final AuthenticationService authenticationService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @GetMapping("/email-exists")
    public ResponseEntity<?> checkEmailExists(@RequestParam("email") String email) {
        boolean emailExists = authenticationService.isEmailExists(email);
        System.out.println("Checking email existence for: " + email);
        if (emailExists) {
            return ResponseEntity.badRequest().body(new ErrorResponse("Email already exists"));
        }
        return ResponseEntity.ok().build();
    }


    @GetMapping("/mobile-number-exists")
    public ResponseEntity<?> checkMobileNumberExists(@RequestParam("mobileNumber") Long mobileNumber) {
        boolean mobileNumberExists = authenticationService.isMobileNumberExists(mobileNumber);
        return ResponseEntity.ok().body(Map.of("exists", mobileNumberExists));
    }
    
   @PostMapping("/addUserBill")
	public Bill addUserBill(@RequestBody Bill billrequest){
        Bill response = restTemplate.postForObject(
            "http://localhost:8183/api/bill/add",
            billrequest,
            Bill.class
        );
        return response;
	}
}
