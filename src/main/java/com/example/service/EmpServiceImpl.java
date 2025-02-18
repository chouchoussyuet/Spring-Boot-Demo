package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.modal.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeById(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        return opt.orElse(null);
    }

    @Override
    public void addEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shubham", "Lucknow"));
        employees.add(new Employee("Puneet", "Delhi"));
        employees.add(new Employee("Abhay", "Pune"));
        employees.add(new Employee("Anurag", "Noida"));
        employeeRepository.saveAll(employees);
    }

    @Override
    public void deleteAllData() {
        employeeRepository.deleteAll();
    }
}
