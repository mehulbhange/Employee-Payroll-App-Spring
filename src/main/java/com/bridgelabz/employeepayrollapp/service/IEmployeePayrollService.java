package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.entity.EmployeePayrollData;

import java.time.LocalDate;
import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);

    List<EmployeePayrollData> getEmployeeByDepartment(String department);

    List<EmployeePayrollData> getEmployeeStartedAfter(LocalDate startDate);
}
