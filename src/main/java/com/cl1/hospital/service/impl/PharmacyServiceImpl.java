package com.cl1.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl1.hospital.model.Pharmacy;
import com.cl1.hospital.repo.PharmacyRepo;
import com.cl1.hospital.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService{

	@Autowired
	PharmacyRepo pharmacyRepo;
	
	@Override
	public List<Pharmacy> list() {
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy c) {
		return pharmacyRepo.save(c);
	}

	@Override
	public Pharmacy update(Pharmacy c) {
		return pharmacyRepo.save(c);
	}

	@Override
	public void delete(int id) {
		pharmacyRepo.deleteById(id);
	}

}