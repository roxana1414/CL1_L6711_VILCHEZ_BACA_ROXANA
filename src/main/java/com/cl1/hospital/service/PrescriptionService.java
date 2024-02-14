package com.cl1.hospital.service;

import java.util.List;

import com.cl1.hospital.model.Prescription;
import com.cl1.hospital.projections.ReportPrescriptionCostByPatient;


public interface PrescriptionService {
	public List<Prescription> list();
	public Prescription add(Prescription c);
	public Prescription update(Prescription c);
	public void delete(int id);
	public List<ReportPrescriptionCostByPatient> reportPrescriptionCostByPatient();
}
