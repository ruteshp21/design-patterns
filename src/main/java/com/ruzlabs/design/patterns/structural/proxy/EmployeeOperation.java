package com.ruzlabs.design.patterns.structural.proxy;

public class EmployeeOperation {

    public static void main(String[] args) {
        System.out.println("Calling addEmployee..");
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.addEmployee();
        System.out.println("Calling addEmployee via Proxy..");
        employeeService = new EmployeeServiceProxy();
        employeeService.addEmployee();
    }
}
