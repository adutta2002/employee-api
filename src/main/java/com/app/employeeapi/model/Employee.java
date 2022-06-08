package com.app.employeeapi.model;

public class Employee {

	private Long employeeId;
	private String employeeName;
	private String employeeTenure;
	
	

	public Employee() {
		super();
	}

	public Employee(Long employeeId, String employeeName, String employeeTenure) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeTenure = employeeTenure;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeTenure() {
		return employeeTenure;
	}

	public void setEmployeeTenure(String employeeTenure) {
		this.employeeTenure = employeeTenure;
	}

}
