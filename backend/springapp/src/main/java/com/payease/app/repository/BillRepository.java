package com.payease.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payease.app.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, String> {
	
	List<Bill> findByEmail(String email);

	void deleteById(Long id);
}
