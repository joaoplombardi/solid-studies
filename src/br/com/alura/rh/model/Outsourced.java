package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Outsourced {

    private PersonalData personalData;
    private String company;

    public Outsourced(String name, String cpf, JobRole jobRole, BigDecimal wage, String company) {
        this.personalData = new PersonalData(name, cpf, jobRole, wage);
        this.company = company;
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


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
