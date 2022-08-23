package br.com.alura.rh.service.readjustment;

import br.com.alura.rh.exception.ValidateException;
import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidationReadjustmentPercentual implements ReadjustmentValidation {

    @Override
    public void validate(Employee employee, BigDecimal readjustment){
        BigDecimal adjustmentPercentage = readjustment.divide(employee.getWage(), RoundingMode.HALF_UP);

        if (adjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidateException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }

}
