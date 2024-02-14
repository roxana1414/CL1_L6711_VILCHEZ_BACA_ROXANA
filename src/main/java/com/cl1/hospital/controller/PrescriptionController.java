package com.cl1.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cl1.hospital.model.Prescription;
import com.cl1.hospital.projections.ReportPrescriptionCostByPatient;
import com.cl1.hospital.service.PrescriptionService;


@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	@Autowired
	PrescriptionService prescriptionService;

	@GetMapping
	public ResponseEntity<List<Prescription>> list(){
		return  new ResponseEntity<>(prescriptionService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription c) {
		return new ResponseEntity<>(prescriptionService.add(c), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription c) {
		return new ResponseEntity<>(prescriptionService.update(c), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/cost")
	public ResponseEntity<List<ReportPrescriptionCostByPatient>> reportPrescriptionCostByPatient(){
		return  new ResponseEntity<>(prescriptionService.reportPrescriptionCostByPatient(), HttpStatus.OK)  ;
	}
}
