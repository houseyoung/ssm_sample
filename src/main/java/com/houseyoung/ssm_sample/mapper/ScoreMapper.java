package com.houseyoung.ssm_sample.mapper;

import com.houseyoung.ssm_sample.dto.ScoreDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by houseyoung on 15/8/24.
 */
public interface ScoreMapper {
    public void add(@Param("scoreDto") ScoreDto scoreDto) throws Exception;

    public void update(@Param("scoreDto") ScoreDto scoreDto) throws Exception;

    public void deleteById(@Param("id") int id) throws Exception;

    public List<ScoreDto> listScore(@Param("keywords") String keywords) throws Exception;

    public List<ScoreDto> listScoreByStudentId(@Param("studentId") int studentId) throws Exception;

    public ScoreDto queryById(@Param("id") int id) throws Exception;
}