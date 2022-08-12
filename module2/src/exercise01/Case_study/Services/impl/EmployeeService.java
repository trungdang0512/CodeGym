package exercise01.Case_study.Services.impl;

import exercise01.Case_study.Services.IsEmployeeService;

public class EmployeeService implements IsEmployeeService {

    @Override
    public void displayMenu() {
        System.out.println("Menu");
    }

    @Override
    public void addEmployee() {
        System.out.println("Đã thêm");
    }

    @Override
    public void editEmployee() {
        System.out.println("Edit");
    }
}
