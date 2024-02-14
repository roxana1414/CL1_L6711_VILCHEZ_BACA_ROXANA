package com.cl1.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cl1.hospital.model.Prescription;
import com.cl1.hospital.projections.ReportPrescriptionCostByPatient;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer> {

	@Query("SELECT p.patient.patientId AS patientId, "
			+ "p.patient.patientFName AS name, "
			+ "p.patient.patientLName AS lastName, "
			+ "SUM(p.prescriptionCost) AS totalPrescriptionCost "
			+ "FROM Prescription p " 
			+ "GROUP BY p.patient.patientId, p.patient.patientFName, p.patient.patientLName")
	List<Object[]> reportPrescriptionCostByPatient();
}
