package com.cl1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl1.hospital.model.Pharmacy;


public interface PharmacyRepo extends JpaRepository<Pharmacy, Integer>{

	
}
