package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CollegeDTO;
import com.rays.dto.StudentDTO;

public class StudentForm extends BaseForm {
	
	@NotEmpty(message = "please enter enrolNo")
	private String enrolNo;

	@NotEmpty(message = "please enter first_name")
	private String firstName;

	@NotEmpty(message = "please enter last_name")
	private String lastName;

	@NotNull(message = "please enter DOB")
	private Date dob;

	@NotEmpty(message = "please enter phoneNo")
	private String phoneNo;

	@NotEmpty(message = "please enter email")
	private String email;

	@NotNull(message = "please enter collegeId")
	private Long collegeId;

	public String getEnrolNo() {
		return enrolNo;
	}

	public void setEnrolNo(String enrolNo) {
		this.enrolNo = enrolNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
   
	@Override
	public BaseDTO getDto() {
		
		System.out.println("iiiiiiiiiiiiiiiiii");
		
		StudentDTO dto = initDTO(new StudentDTO());
		
		dto.setEnrolNo(enrolNo);
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setDob(dob);
		dto.setPhoneNo(phoneNo);
		dto.setEmail(email);
		dto.setCollegeId(collegeId);
		
		return dto;
		
	}

}
