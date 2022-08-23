package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.exception.ValidateException;

public class Employee {

	private PersonalData personalData;
	private LocalDate lastAdjustmentDate;

	public Employee(PersonalData personalData) {
		this.personalData = personalData;
	}

	public String getName() {
		return personalData.getName();
	}


	public String getCpf() {
		return personalData.getCpf();
	}


	public JobRole getCargo() {
		return personalData.getJobRole();
	}


	public BigDecimal getWage() {
		return personalData.getWage();
	}


	public LocalDate getLastAdjustmentDate() {
		return lastAdjustmentDate;
	}


	public void updateWage(BigDecimal newWage) {
		this.personalData.setWage(newWage);
		this.lastAdjustmentDate = LocalDate.now();
	}

	public void promote(JobRole newJob) {
		this.personalData.setJobRole(newJob);
	}
}
