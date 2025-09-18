package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CollegeDTO;
import com.rays.dto.StudentDTO;

@Repository
public class StudentDAOImpl extends BaseDAOImpl<StudentDTO> implements StudentDAOInt {
    
	@Autowired
	CollegeDAOInt collegeService = null;
	
	@Override
	public Class<StudentDTO> getDTOClass() {
		return StudentDTO.class;
	}
	@Override
	protected void populate(StudentDTO dto, UserContext userContext) {
		CollegeDTO collegeDTO = collegeService.findByPK(dto.getCollegeId(), userContext);
		if (collegeDTO != null) {
			dto.setCollegeName(collegeDTO.getName());
		}
	}

	@Override
	protected List<Predicate> getWhereClause(StudentDTO dto, CriteriaBuilder builder, Root<StudentDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getEnrolNo())) {

			whereCondition.add(builder.like(qRoot.get("enrolNo"), dto.getEnrolNo() + "%"));
		}
		if (!isEmptyString(dto.getFirstName())) {

			whereCondition.add(builder.equal(qRoot.get("fiestName"), dto.getFirstName()));
		}
		if (!isEmptyString(dto.getLastName())) {

			whereCondition.add(builder.equal(qRoot.get("lastName"), dto.getLastName()));
		}
		if (isNotNull(dto.getDob())) {

			whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
		}
		if (!isEmptyString(dto.getPhoneNo())) {

			whereCondition.add(builder.equal(qRoot.get("phoneNo"), dto.getPhoneNo()));
		}
		if (!isEmptyString(dto.getEmail())) {

			whereCondition.add(builder.equal(qRoot.get("email"), dto.getEmail()));
		}
		if (!isNotNull(dto.getCollegeId())) {

			whereCondition.add(builder.equal(qRoot.get("collegeId"), dto.getCollegeId()));
		}
		return whereCondition;
	}
}
