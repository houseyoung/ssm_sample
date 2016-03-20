package com.houseyoung.ssm_sample.controller;

import com.houseyoung.ssm_sample.dto.ScoreDto;
import com.houseyoung.ssm_sample.service.ScoreService;
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
@RequestMapping(value = "score")
public class ScoreController {
    @Resource
    private ScoreService scoreService;

    //显示、搜索成绩
    @RequestMapping(value = "score_list")
    public String toScoreList(Integer studentId, String keywords, Model model) throws Exception{
        if (studentId == null){
            List<ScoreDto> listScore = scoreService.listScore(keywords);
            model.addAttribute("listScore", listScore);
            return "score/score_list";
        }

        else {
            List<ScoreDto> listScore = scoreService.listScore(studentId);
            model.addAttribute("listScore", listScore);
            return "score/score_list";
        }
    }

    //增加成绩
    @RequestMapping(value = "score_add", method = RequestMethod.GET)
    public String toScoreAdd() {
        return "score/score_add";
    }

    @RequestMapping(value = "score_add", method = RequestMethod.POST)
    public String ScoreAdd(ScoreDto scoreDto) throws Exception{
        scoreService.add(scoreDto);
        return "redirect:score_list";
    }

    //修改成绩
    @RequestMapping(value = "score_edit", method = RequestMethod.GET)
    public String toScoreEdit(Integer id, Model model) throws Exception{
        ScoreDto scoreDto = scoreService.queryById(id);
        model.addAttribute("scoreDto", scoreDto);
        return "score/score_edit";
    }

    @RequestMapping(value = "score_edit", method = RequestMethod.POST)
    public String ScoreEdit(ScoreDto scoreDto) throws Exception{
        scoreService.update(scoreDto);
//    public String ScoreEdit(Integer id, String score) throws Exception{
//        scoreService.update(id, score);
        return "redirect:score_list";
    }

    //删除成绩
    @RequestMapping(value = "score_delete", method = RequestMethod.GET)
    public String toScoreDelete(Integer id) throws Exception{
        scoreService.deleteById(id);
        return "redirect:score_list";
    }
}