package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MarksheetDTO;
import com.rays.dto.StudentDTO;

public class MarksheetForm extends BaseForm {
	
	@NotNull(message = "please enter rollNo")
	protected String rollNo = null;

	@NotNull(message = "please enter studentId")
	protected Long studentId;

	@NotEmpty(message = "please enter name")
	protected String name = null;

	@NotNull(message = "please enter physics marks")
	protected Integer physics;

	@NotNull(message = "please enter chemistry marks")
	protected Integer chemistry;

	@NotNull(message = "please enter maths marks")
	protected Integer maths;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhysics() {
		return physics;
	}

	public void setPhysics(Integer physics) {
		this.physics = physics;
	}

	public Integer getChemistry() {
		return chemistry;
	}

	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	
	@Override
	public BaseDTO getDto() {
		
		System.out.println("iiiiiiiiiiiiiiiiii");
		
		MarksheetDTO dto = initDTO(new MarksheetDTO());
		
		dto.setRollNo(rollNo);
		dto.setName(name);
		dto.setPhysics(physics);
		dto.setChemistry(chemistry);
		dto.setMaths(maths);
		
		return dto;
		
	}

}
