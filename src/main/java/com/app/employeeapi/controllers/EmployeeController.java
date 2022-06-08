package com.app.employeeapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.employeeapi.model.Employee;

@RestController
public class EmployeeController {

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/employee/name")
	public String getemployeeName(@RequestParam(name = "empId") Long id) {

		if (id == 1) {

			Employee emp = new Employee();
			emp.setEmployeeId(1l);
			emp.setEmployeeName("Jhon");
			emp.setEmployeeTenure("3 years");

			return emp.getEmployeeName();
		} else {
			return "Employee not found ";
		}

	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/employee/tenure")
	public String getemployeeTenure(@RequestParam(name = "empId") Long id) {

		if (id == 1) {

			Employee emp = new Employee();
			emp.setEmployeeId(1l);
			emp.setEmployeeName("Jhon");
			emp.setEmployeeTenure("3 years");

			return emp.getEmployeeTenure();
		} else {
			return "Employee not found ";
		}

	}
}
