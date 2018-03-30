package com.hongjiuxin.smartapartment.service;

import com.hongjiuxin.smartapartment.model.Student;
import java.util.List;

public interface StudentService {

	public List<Student> queryByPage(Integer start, Integer pageSize);

}
