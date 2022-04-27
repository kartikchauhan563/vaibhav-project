package com.webapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employee")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
//	private String firstName;
//	private String lastName;
//	private String email;
	
	
	
	
	private String JobName;
	private String Employer;
	private String Address;
	private String ContactNumber;
	private String ContactEmailId;
	private String Experience;
	private String SkillsRequired;
	private String Qualification;
	private String Location;
	private String Salary;
	private String NoOfVacancies;
	public Employee(long id, String jobName, String employer, String address, String contactNumber, String contactEmailId,
			String experience, String skillsRequired, String qualification, String location, String salary,
			String noOfVacancies) {
		super();
		this.id = id;
		JobName = jobName;
		Employer = employer;
		Address = address;
		ContactNumber = contactNumber;
		ContactEmailId = contactEmailId;
		Experience = experience;
		SkillsRequired = skillsRequired;
		Qualification = qualification;
		Location = location;
		Salary = salary;
		NoOfVacancies = noOfVacancies;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public String getEmployer() {
		return Employer;
	}
	public void setEmployer(String employer) {
		Employer = employer;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getContactEmailId() {
		return ContactEmailId;
	}
	public void setContactEmailId(String contactEmailId) {
		ContactEmailId = contactEmailId;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getSkillsRequired() {
		return SkillsRequired;
	}
	public void setSkillsRequired(String skillsRequired) {
		SkillsRequired = skillsRequired;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getNoOfVacancies() {
		return NoOfVacancies;
	}
	public void setNoOfVacancies(String noOfVacancies) {
		NoOfVacancies = noOfVacancies;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", JobName=" + JobName + ", Employer=" + Employer + ", Address=" + Address
				+ ", ContactNumber=" + ContactNumber + ", ContactEmailId=" + ContactEmailId + ", Experience="
				+ Experience + ", SkillsRequired=" + SkillsRequired + ", Qualification=" + Qualification + ", Location="
				+ Location + ", Salary=" + Salary + ", NoOfVacancies=" + NoOfVacancies + "]";
	}
	
	
	
	//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public Employee(long id, String firstName, String lastName, String email) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//	}
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
//	}
	
	
	
}
