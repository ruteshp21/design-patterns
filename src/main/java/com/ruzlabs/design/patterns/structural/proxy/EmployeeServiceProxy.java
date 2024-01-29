package com.ruzlabs.design.patterns.structural.proxy;

public class EmployeeServiceProxy implements EmployeeService {

    EmployeeService employeeService;

    public EmployeeServiceProxy() {
        this.employeeService = new EmployeeServiceImpl();
    }

    @Override
    public void addEmployee() {
        System.out.println("Calling Proxy");
        this.employeeService.addEmployee();
    }
}
