package br.com.alura.rh.service.readjustment;

import br.com.alura.rh.exception.ValidateException;
import br.com.alura.rh.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodicityValidation implements ReadjustmentValidation {

    @Override
    public void validate(Employee employee, BigDecimal readjustment) {
        LocalDate lastAdjustmentDate = employee.getLastAdjustmentDate();
        LocalDate currentDate = LocalDate.now();
        long monthsSinceLastReadjustment = ChronoUnit.MONTHS.between(lastAdjustmentDate, currentDate);

        if (monthsSinceLastReadjustment < 6) {
            throw new ValidateException("Intervalo entre reajustes deve ser no mínimo 6 meses.");
        }
    }
}
