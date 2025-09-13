package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserRegistrationForm {

	@NotEmpty(message = "please enter first name")
	private String firstName;

	@NotEmpty(message = "please enter last name")
	private String lastName;

	@Email
	@NotEmpty(message = "please enter email")
	private String loginId;

	@NotEmpty(message = "please enter password")
	private String password;

	@NotNull(message = "Date of birth is required")
	private Date dob;

	@NotEmpty(message = "please enter gender")
	private String gender;

	@NotEmpty(message = "please enter phone")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

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

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
