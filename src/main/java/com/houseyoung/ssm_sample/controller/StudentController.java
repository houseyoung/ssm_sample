package com.houseyoung.ssm_sample.controller;

import com.houseyoung.ssm_sample.entity.Student;
import com.houseyoung.ssm_sample.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by houseyoung on 15/8/21.
 */
@Controller
@RequestMapping(value = "student")

public class StudentController {

    @Resource
    private StudentService studentService;

    //显示、搜索学生
    @RequestMapping(value = "student_list")
    public String toStudentList(String keywords, Model model) throws Exception{
        List<Student> listStudent = studentService.listStudent(keywords);
        model.addAttribute("listStudent", listStudent);
        return "student/student_list";
    }

    //增加学生
    @RequestMapping(value = "student_add", method = RequestMethod.GET)
    public String toStudentAdd() {
        return "student/student_add";
    }

    @RequestMapping(value = "student_add", method = RequestMethod.POST)
    public String StudentAdd(Student student) throws Exception{
        studentService.add(student);
        return "redirect:student_list";
    }

    //修改学生
    @RequestMapping(value = "student_edit", method = RequestMethod.GET)
    public String toStudentEdit(Integer id, Model model) throws Exception{
        Student student = studentService.queryById(id);
        model.addAttribute("student", student);
        return "student/student_edit";
    }

    @RequestMapping(value = "student_edit", method = RequestMethod.POST)
//    public String StudentEdit(Student student) throws Exception{
    public String StudentEdit(Integer id, Integer studentId, String studentName, String studentSex, String studentOld) throws Exception{
//        studentService.update(student);
        studentService.update(id, studentId, studentName, studentSex, studentOld);
        return "redirect:student_list";
    }

    //删除学生
    @RequestMapping(value = "student_delete", method = RequestMethod.GET)
    public String toStudentDelete(Integer id) throws Exception{
        studentService.deleteById(id);
        return "redirect:student_list";
    }
}