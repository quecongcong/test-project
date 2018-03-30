package com.hongjiuxin.smartapartment.controller;

import com.hongjiuxin.smartapartment.model.Student;
import com.hongjiuxin.smartapartment.service.StudentService;
import com.hongjiuxin.smartapartment.web.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stu")
@Api(value = "student",description="学生")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@ResponseBody
	@RequestMapping(value="/show",method=RequestMethod.GET)
	@ApiOperation(value="获取学生列表",httpMethod="GET")
	public Result<List<Student>> queryByPage(@ApiParam("页号") @RequestParam(required=true) Integer pageNo,
			@ApiParam("页容") @RequestParam(required=true) Integer pageSize){
		List<Student> students= studentService.queryByPage((pageNo-1)*pageSize, pageSize);
		for (Student student : students) {
			System.out.println(student);
		}
		return Result.success(students);
	}
}
