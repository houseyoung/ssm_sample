package com.houseyoung.ssm_sample.service.impl;

import com.houseyoung.ssm_sample.entity.Student;
import com.houseyoung.ssm_sample.mapper.StudentMapper;
import com.houseyoung.ssm_sample.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houseyoung on 15/8/21.
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //显示、搜索学生
    @Override
    public List<Student> listStudent(@Param("keywords") String keywords) throws Exception {
        try {
            return studentMapper.listStudent(keywords);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //新增学生
    @Override
    public void add(@Param("student") Student student) throws Exception {
        if (student == null) {
            return ;
        }

        try {
            studentMapper.add(student);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //更新学生
    @Override
//    public void update(@Param("student") Student student) throws Exception {
    public void update(int id, int studentId, String studentName, String studentSex, String studentOld) throws Exception {
//        if (Assert.isNull(student)) {
        if (id <= 0) {
            return ;
        }

        try {
            Student student = new Student();
            student.setId(id);
            student.setStudentId(studentId);
            student.setStudentName(studentName);
            student.setStudentSex(studentSex);
            student.setStudentOld(studentOld);
            studentMapper.update(student);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据ID查询学生
    @Override
    public Student queryById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return null;
        }
        try {
            return studentMapper.queryById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据ID删除学生
    @Override
    public void deleteById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return ;
        }

        try {
            studentMapper.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}