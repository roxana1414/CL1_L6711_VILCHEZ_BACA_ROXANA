package com.cl1.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomNum;
	
	private LocalDate admissionDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "staff_id")
	private Staff staff;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "patient_id")
	private Patient patient;
}
