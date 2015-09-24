package za.ac.ngosa.services.impl;

import za.ac.ngosa.domain.Manager;
import za.ac.ngosa.repository.EmployeeRepository;
import za.ac.ngosa.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Manager> getEmployees()
    {
        List <Manager> allEmployees = new ArrayList<>();

        Iterable<Manager> employees= repository.findAll();
        for(Manager employee: employees)
        {
            allEmployees.add(employee);
        }

        return allEmployees;
    }

    @Override
    public Manager getEmployee(long id) {
        return repository.findOne(id);
    }

    @Override
    public Manager addEmployee(Manager employee) {

        return repository.save(employee);
    }

    @Override
    public void removeEmployee(Manager employee) {

        repository.delete(employee);

    }

    @Override
    public Manager updateEmployee(Manager employee) {

        return repository.save(employee);
    }

}
