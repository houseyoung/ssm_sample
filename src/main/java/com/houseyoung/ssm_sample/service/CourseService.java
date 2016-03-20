package com.houseyoung.ssm_sample.service;

import com.houseyoung.ssm_sample.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by houseyoung on 15/8/24.
 */
public interface CourseService {
    public void add(@Param("course") Course course) throws Exception;

    public void update(int id, String courseName, String courseTeacherName) throws Exception;

    public void deleteById(@Param("id") int id) throws Exception;

    public List<Course> listCourse(@Param("keywords") String keywords) throws Exception;

    public Course queryById(@Param("id") int id) throws Exception;
}
