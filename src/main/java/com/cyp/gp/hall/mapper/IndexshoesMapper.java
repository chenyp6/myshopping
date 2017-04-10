package com.cyp.gp.hall.mapper;

import com.cyp.gp.hall.dao.Indexshoes;
import com.cyp.gp.hall.dao.IndexshoesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexshoesMapper {
    int countByExample(IndexshoesExample example);

    int deleteByExample(IndexshoesExample example);

    int deleteByPrimaryKey(String shoesid);

    int insert(Indexshoes record);

    int insertSelective(Indexshoes record);

    List<String> getShoesid();

    List<Indexshoes> selectByExample(IndexshoesExample example);

    Indexshoes selectByPrimaryKey(String shoesid);

    int updateByExampleSelective(@Param("record") Indexshoes record, @Param("example") IndexshoesExample example);

    int updateByExample(@Param("record") Indexshoes record, @Param("example") IndexshoesExample example);

    int updateByPrimaryKeySelective(Indexshoes record);

    int updateByPrimaryKey(Indexshoes record);
}