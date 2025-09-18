package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CollegeDTO;

public class CollegeForm extends BaseForm {

	@NotEmpty(message = "please enter name")
	private String name;

	@NotEmpty(message = "please enter address")
	private String address;

	@NotEmpty(message = "please enter State")
	private String state;

	@NotEmpty(message = "please enter city name")
	private String city;

	@NotEmpty(message = "please enter phoneNo")
	private String phoneNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public BaseDTO getDto() {

		System.out.println("iiiiiiiiiiiiiiiiii");

		CollegeDTO dto = initDTO(new CollegeDTO());

		dto.setName(name);
		dto.setAddress(address);
		dto.setState(state);
		dto.setCity(city);
		dto.setPhoneNo(phoneNo);

		return dto;

	}

}
