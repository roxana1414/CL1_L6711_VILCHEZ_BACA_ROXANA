package com.cl1.hospital.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportPrescriptionCostByPatient {
	private Integer pacientId;
	private String name;
	private String lastName;
	private Double totalPrescriptionCost;
}
