package com.houseyoung.ssm_sample.service.impl;

import com.houseyoung.ssm_sample.entity.Course;
import com.houseyoung.ssm_sample.mapper.CourseMapper;
import com.houseyoung.ssm_sample.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houseyoung on 15/8/24.
 */
@Service("CourseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    //显示、搜索课程
    @Override
    public List<Course> listCourse(@Param("keywords") String keywords) throws Exception {
        try {
            return courseMapper.listCourse(keywords);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //新增课程
    @Override
    public void add(@Param("course") Course course) throws Exception {
        if (course == null) {
            return ;
        }

        try {
            courseMapper.add(course);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //修改课程
    @Override
    public void update(int id, String courseName, String courseTeacherName) throws Exception {
        if (id <= 0){
            return ;
        }

        try {
            Course course = new Course();
            course.setId(id);
            course.setCourseName(courseName);
            course.setCourseTeacherName(courseTeacherName);
            courseMapper.update(course);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据ID查询课程
    @Override
    public Course queryById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return null;
        }
        try {
            return courseMapper.queryById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据ID删除课程
    @Override
    public void deleteById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return ;
        }

        try {
            courseMapper.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
