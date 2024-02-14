package com.cl1.hospital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl1.hospital.model.Prescription;
import com.cl1.hospital.projections.ReportPrescriptionCostByPatient;
import com.cl1.hospital.repo.PrescriptionRepo;
import com.cl1.hospital.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{

	@Autowired
	PrescriptionRepo prescriptionRepo;
	
	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription c) {
		return prescriptionRepo.save(c);
	}

	@Override
	public Prescription update(Prescription c) {
		return prescriptionRepo.save(c);
	}

	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);
	}

	@Override
	public List<ReportPrescriptionCostByPatient> reportPrescriptionCostByPatient() {
		List<Object[]> resultList = prescriptionRepo.reportPrescriptionCostByPatient();
		List<ReportPrescriptionCostByPatient> reportList = new ArrayList<>();

	    for (Object[] row : resultList) {
	        Integer pacientId = (Integer) row[0];
	        String name = (String) row[1];
	        String lastName = (String) row[2];
	        Double totalPrescriptionCost = (Double) row[3];

	        ReportPrescriptionCostByPatient report = new ReportPrescriptionCostByPatient(pacientId, name, lastName, totalPrescriptionCost);
	        reportList.add(report);
	    }
		return reportList;
	}

}