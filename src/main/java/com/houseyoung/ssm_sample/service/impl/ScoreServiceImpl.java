package com.houseyoung.ssm_sample.service.impl;

import com.houseyoung.ssm_sample.dto.ScoreDto;
import com.houseyoung.ssm_sample.mapper.ScoreMapper;
import com.houseyoung.ssm_sample.service.ScoreService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by houseyoung on 15/8/24.
 */
@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    //显示、搜索成绩
    @Override
    public List<ScoreDto> listScore(@Param("keywords") String keywords) throws Exception {
        try {
            return scoreMapper.listScore(keywords);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据学生ID列出成绩
    @Override
    public List<ScoreDto> listScore(@Param("studentId") int studentId) throws Exception {
        try {
            return scoreMapper.listScoreByStudentId(studentId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //新增成绩
    @Override
    public void add(@Param("scoreDto") ScoreDto scoreDto) throws Exception {
        if (scoreDto == null) {
            return ;
        }

        try {
            scoreMapper.add(scoreDto);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //修改成绩
    @Override
    public void update(@Param("scoreDto") ScoreDto scoreDto) throws Exception {
        if (scoreDto == null) {
            return ;
        }

        try {
            scoreMapper.update(scoreDto);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据ID删除成绩
    @Override
    public void deleteById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return ;
        }

        try {
            scoreMapper.deleteById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //根据成绩ID查询成绩
    @Override
    public ScoreDto queryById(@Param("id") int id) throws Exception {
        if (id <= 0) {
            return null;
        }
        try {
            return scoreMapper.queryById(id);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
