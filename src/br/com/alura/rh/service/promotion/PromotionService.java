package br.com.alura.rh.service.promotion;

import br.com.alura.rh.exception.ValidateException;
import br.com.alura.rh.model.Employee;
import br.com.alura.rh.model.JobRole;

public class PromotionService {

    public void promote(Employee employee, boolean goalHit){
        JobRole currentJob = employee.getCargo();

        if (JobRole.GERENTE.equals(currentJob)){
            throw new ValidateException("Gerentes não podem ser promovidos!");
        }

        if (goalHit) {
            employee.promote(currentJob.getNextJob());
        } else {
            throw new ValidateException("Funcionário não atingiu a meta!");
        }

    }

}
