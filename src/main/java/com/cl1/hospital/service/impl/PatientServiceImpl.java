package com.cl1.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl1.hospital.model.Patient;
import com.cl1.hospital.repo.PatientRepo;
import com.cl1.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepo patientRepo;
	
	@Override
	public List<Patient> list() {
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient c) {
		return patientRepo.save(c);
	}

	@Override
	public Patient update(Patient c) {
		return patientRepo.save(c);
	}

	@Override
	public void delete(int id) {
		patientRepo.deleteById(id);
	}

}