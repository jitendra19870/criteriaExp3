package com.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TABLE_DATA")
public class Employee {
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	@Column(name="ename")
	private String employeeName;
	@Column(name="email")
	private String employeeEmail;
	@Column(name="esal")
	private Double employeeSal;
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Double getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(Double employeeSal) {
		this.employeeSal = employeeSal;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeSal=" + employeeSal + "]";
	}
	
	

}
