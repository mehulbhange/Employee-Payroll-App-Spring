package com.bridgelabz.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    @Min(value = 500, message = "Salary should be more than 500")
    public long salary;

}
