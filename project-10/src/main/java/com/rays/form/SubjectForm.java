package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CollegeDTO;
import com.rays.dto.SubjectDTO;

public class SubjectForm extends BaseForm {
	
	@NotNull(message = "please enter courseId")
	private long courseId;

	@NotEmpty(message = "please enter courseName")
	private String courseName;

	@NotEmpty(message = "please enter name")
	private String name;

	@NotEmpty(message = "please enter description")
	private String description;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public BaseDTO getDto() {
		
		System.out.println("iiiiiiiiiiiiiiiiii");
		
		SubjectDTO dto = initDTO(new SubjectDTO());
		
		dto.setCourseId(courseId);
		dto.setCourseName(courseName);
		dto.setName(courseName);
		dto.setDescription(description);
		
		return dto;
	}


}
