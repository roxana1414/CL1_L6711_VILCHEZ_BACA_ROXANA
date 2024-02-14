package com.cl1.hospital.service;

import java.util.List;

import com.cl1.hospital.model.Patient;


public interface PatientService {
	public List<Patient> list();
	public Patient add(Patient c);
	public Patient update(Patient c);
	public void delete(int id);
}
