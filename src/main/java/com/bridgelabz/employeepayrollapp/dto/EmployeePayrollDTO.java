package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    @Min(value = 500, message = "Salary should be more than 500")
    public long salary;
    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    @NotEmpty(message = "Gender should not be Empty")
    public String gender;
    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "start date should not be Empty")
    @PastOrPresent(message = "Start date should be past or todays date")
    public LocalDate startDate;
    @NotBlank(message = "Note cannot be Empty")
    public String note;
    @NotBlank(message = "profilePic cannot be Empty")
    public String profilePic;
    @NotNull(message = "department should not be Empty")
    public List<String> departments;

}
