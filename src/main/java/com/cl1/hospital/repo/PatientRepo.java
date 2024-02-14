package com.cl1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cl1.hospital.model.Patient;


public interface PatientRepo extends JpaRepository<Patient, Integer>{

	
}
