package com.cg.employeecodemodule.models;

import java.util.Date;








import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="MyEmployee")

public class Employee {

@Id
	@Field(value = "employee_id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employeeId;

@Field(value= "employee_name")
	@NotNull(message = "Name Cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z0-9_ ]*$", message = "Name Should Start with Capital Letter")
	private String employeeName;
	
@Field(value = "employee_pan")
	@NotNull
	private String employeePan;
	
@Field(value = "employee_designation")
	@NotNull
	@Pattern(regexp = "^[A-Z]{1}[A-Za-z0-9_ ]*$", message = "Designation Should Start with Capital Letter")
	private String employeeDesignation;
	
@Field(value= "employee_domain")
	@NotNull
	@Pattern(regexp = "^[a-zA-Z ._-]*$", message = "Name Should Start with Capital Letter")
	private String employeeDomain;
	
@Field(value = "employee_doj")
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date employeeDOJ;
	
@Field(value = "employee_dob")
	@NotNull
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date employeeDOB;
	
@Field(value= "employee_salary")
	@Range(min = 5000, message = "Salary Should be 5000 minimum")
	private double employeeSalary;
	
@Field(value = "employee_mail")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Email Id is in Wrong Format")
	@NotNull(message = "Email Id Cannot Be Null")
	private String employeeMailId;
	
@Field(value = "employee_password")
	@NotNull(message = "Password Cannot Be Null")
	private String employeePassword;

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeePan=" + employeePan
				+ ", employeeDesignation=" + employeeDesignation
				+ ", employeeDomain=" + employeeDomain + ", employeeDOJ="
				+ employeeDOJ + ", employeeDOB=" + employeeDOB
				+ ", employeeSalary=" + employeeSalary + ", employeeMailId="
				+ employeeMailId + ", employeePassword=" + employeePassword
				+ "]";
	}
	
	public Employee(String employeeName, String employeePan,
			String employeeDesignation, String employeeDomain,
			Date employeeDOJ, Date employeeDOB, double employeeSalary,
			String employeeMailId, String employeePassword) {
		super();
		this.employeeName = employeeName;
		this.employeePan = employeePan;
		this.employeeDesignation = employeeDesignation;
		this.employeeDomain = employeeDomain;
		this.employeeDOJ = employeeDOJ;
		this.employeeDOB = employeeDOB;
		this.employeeSalary = employeeSalary;
		this.employeeMailId = employeeMailId;
		this.employeePassword = employeePassword;
	}

	public Employee(long employeeId, String employeeName, String employeePan,
			String employeeDesignation, String employeeDomain,
			Date employeeDOJ, Date employeeDOB, double employeeSalary,
			String employeeMailId, String employeePassword) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePan = employeePan;
		this.employeeDesignation = employeeDesignation;
		this.employeeDomain = employeeDomain;
		this.employeeDOJ = employeeDOJ;
		this.employeeDOB = employeeDOB;
		this.employeeSalary = employeeSalary;
		this.employeeMailId = employeeMailId;
		this.employeePassword = employeePassword;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePan() {
		return employeePan;
	}

	public void setEmployeePan(String employeePan) {
		this.employeePan = employeePan;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeDomain() {
		return employeeDomain;
	}

	public void setEmployeeDomain(String employeeDomain) {
		this.employeeDomain = employeeDomain;
	}

	public Date getEmployeeDOJ() {
		return employeeDOJ;
	}

	public void setEmployeeDOJ(Date employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}

	public Date getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(Date employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeMailId() {
		return employeeMailId;
	}

	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}


	

}