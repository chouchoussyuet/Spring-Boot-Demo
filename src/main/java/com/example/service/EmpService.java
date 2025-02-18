package com.example.service;

import java.util.List;
import com.example.modal.Employee;

public interface EmpService {
    List<Employee> findAllEmployee();
    Employee findEmployeeById(long id);
    void addEmployee();
    void deleteAllData();
}
