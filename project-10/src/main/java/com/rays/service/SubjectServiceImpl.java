package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.SubjectDAOInt;
import com.rays.dto.SubjectDTO;

@Service
@Transactional
public class SubjectServiceImpl extends BaseServiceImpl<SubjectDTO, SubjectDAOInt> implements SubjectServiceInt {

	@Override
	public SubjectDTO findByName(String name, UserContext context) {
		SubjectDTO dto=baseDao.findByUniqueKey(name, name, context);
		return dto;
		}


}
