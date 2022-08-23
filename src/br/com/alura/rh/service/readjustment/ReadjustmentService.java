package br.com.alura.rh.service.readjustment;

import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;
import java.util.List;

public class ReadjustmentService {

    private List<ReadjustmentValidation> validations;

    public ReadjustmentService(List<ReadjustmentValidation> validations) {
        this.validations = validations;
    }

    public void readjustmentEmployeeWage(Employee employee, BigDecimal readjustment){
        this.validations.forEach(v -> v.validate(employee, readjustment));

        employee.updateWage(employee.getWage().add(readjustment));
    }

}
