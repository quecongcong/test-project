package com.hongjiuxin.smartapartment.dao;

import com.hongjiuxin.smartapartment.model.Student;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {

	 List<Student> queryByPage(@Param("start") Integer start,
        @Param("pageSize") Integer pageSize);
}
