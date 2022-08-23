package br.com.alura.rh.model;

import java.math.BigDecimal;

public class PersonalData {

    private String name;
    private String cpf;
    private JobRole jobRole;
    private BigDecimal wage;

    public PersonalData(String name, String cpf, JobRole jobRole, BigDecimal wage) {
        this.name = name;
        this.cpf = cpf;
        this.jobRole = jobRole;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public JobRole getJobRole() {
        return jobRole;
    }

    public void setJobRole(JobRole jobRole) {
        this.jobRole = jobRole;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }
}
