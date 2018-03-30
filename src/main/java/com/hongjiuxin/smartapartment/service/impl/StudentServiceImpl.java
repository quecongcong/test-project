package com.hongjiuxin.smartapartment.service.impl;

import com.hongjiuxin.smartapartment.dao.StudentDao;
import com.hongjiuxin.smartapartment.model.Student;
import com.hongjiuxin.smartapartment.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public List<Student> queryByPage(Integer start, Integer pageSize) {
		return studentDao.queryByPage(start, pageSize);
	}

	
}
