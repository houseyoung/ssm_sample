package com.houseyoung.ssm_sample.mapper;

import com.houseyoung.ssm_sample.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by houseyoung on 15/8/21.
 */
public interface StudentMapper {
    public void add(@Param("student") Student student) throws Exception;

    public void update(@Param("student") Student student) throws Exception;

    public void deleteById(@Param("id") int id) throws Exception;

    public List<Student> listStudent(@Param("keywords") String keywords) throws Exception;

    public Student queryById(@Param("id") int id) throws Exception;
}
