package com.bryanscode.employeemanager.service;

import com.bryanscode.employeemanager.exception.UserNotFoundException;
import com.bryanscode.employeemanager.model.Employee;
import com.bryanscode.employeemanager.repository.EmployeeRepository;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
  private final EmployeeRepository employeeRepository;

  @Autowired
  public EmployeeService(EmployeeRepository employeeRepository){
    this.employeeRepository = employeeRepository;
  }

  public Employee addEmployee(Employee employee){
    employee.setEmployeeCode(UUID.randomUUID().toString());
    return employeeRepository.save(employee);
  }

  public List<Employee> findAllEmployees(){
    return employeeRepository.findAll();
  }

  public void deleteEmployee(Long id){
    employeeRepository.deleteEmployeeById(id);
  }

  public Employee findEmployeeById(Long id){
    return employeeRepository.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User with id" + id + "was not found"));
  }

  public Employee updateEmployee(Employee employee){
    return employeeRepository.save(employee);
  }

}
