package com.cl1.hospital.service;

import java.util.List;

import com.cl1.hospital.model.Pharmacy;


public interface PharmacyService {
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy c);
	public Pharmacy update(Pharmacy c);
	public void delete(int id);
}
