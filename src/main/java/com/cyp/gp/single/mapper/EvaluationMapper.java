package com.cyp.gp.single.mapper;

import com.cyp.gp.single.dao.Evaluation;
import com.cyp.gp.single.dao.EvaluationExample;
import com.cyp.gp.single.dao.EvaluationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationMapper {
    int countByExample(EvaluationExample example);

    int deleteByExample(EvaluationExample example);

    int deleteByPrimaryKey(EvaluationKey key);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    List<Evaluation> selectByExample(EvaluationExample example);

    Evaluation selectByPrimaryKey(EvaluationKey key);

    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}