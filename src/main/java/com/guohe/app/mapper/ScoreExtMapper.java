package com.guohe.app.mapper;

import com.guohe.app.dto.RankDTO;
import com.guohe.app.model.Score;

import java.util.List;
import java.util.Map;

/**
 * @author/作者: 邓浩然
 * @description/描述:
 * @data/创建日期: 2020-05-17 14:52
 **/
public interface ScoreExtMapper
{
    //获得所有成绩是数字的科目和成绩
    List<Score> getAllScoreCanCompare(String uid, String semester);
}
