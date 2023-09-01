package com.payease.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payease.app.entity.Bill;
import com.payease.app.repository.BillRepository;

@Service
public class BillService {
	private final BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    public List<Bill> getBillsByEmail(String email) {
        return billRepository.findByEmail(email);
    }

    public void deleteBill(Long id) {
        billRepository.deleteById(id);
    }
}

