package com.sudhakar.dao;

import com.chanti.entity.Employee;

public interface EmployeeDAO {
public Employee findById(int empId);
public List<Employee> getAllEmployees();

}
