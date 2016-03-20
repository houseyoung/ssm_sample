package com.houseyoung.ssm_sample.controller;

import com.houseyoung.ssm_sample.entity.Course;
import com.houseyoung.ssm_sample.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by houseyoung on 15/8/24.
 */
@Controller
@RequestMapping(value = "course")
public class CourseController {
    @Resource
    private CourseService courseService;

    //显示、搜索课程
    @RequestMapping(value = "course_list")
    public String toCourseList(String keywords, Model model) throws Exception{
        List<Course> listCourse = courseService.listCourse(keywords);
        model.addAttribute("listCourse", listCourse);
        return "course/course_list";
    }

    //增加课程
    @RequestMapping(value = "course_add", method = RequestMethod.GET)
    public String toCourseAdd() {
        return "course/course_add";
    }

    @RequestMapping(value = "course_add", method = RequestMethod.POST)
    public String CourseAdd(Course course) throws Exception{
        courseService.add(course);
        return "redirect:course_list";
    }

    //修改课程
    @RequestMapping(value = "course_edit", method = RequestMethod.GET)
    public String toCourseEdit(int id,Model model) throws Exception{
        Course course = courseService.queryById(id);
        model.addAttribute("course", course);
        return "course/course_edit";
    }

    @RequestMapping(value = "course_edit", method = RequestMethod.POST)
//    public String CourseEdit(Course course) throws Exception{
    public String CourseEdit(Integer id, String courseName, String courseTeacherName) throws Exception{
//        courseService.update(course);
        courseService.update(id, courseName, courseTeacherName);
        return "redirect:course_list";
    }

    //删除课程
    @RequestMapping(value = "course_delete", method = RequestMethod.GET)
    public String toCourseDelete(Integer id) throws Exception{
        courseService.deleteById(id);
        return "redirect:course_list";
    }
}