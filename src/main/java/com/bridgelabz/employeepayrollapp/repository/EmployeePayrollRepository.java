package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.entity.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

    @Query(value = "select * from employee_payroll_data, employee_department where employee_id = id and department = :department",
                nativeQuery = true)
    List<EmployeePayrollData> findEmployeeByDepartment(String department);

    List<EmployeePayrollData> findByStartDateAfter(LocalDate startDate);
}
