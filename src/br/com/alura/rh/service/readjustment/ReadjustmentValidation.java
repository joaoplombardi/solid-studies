package br.com.alura.rh.service.readjustment;

import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;

public interface ReadjustmentValidation {
    public void validate(Employee employee, BigDecimal readjustment);
}
