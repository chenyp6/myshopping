package com.cyp.gp.hall.mapper;

import com.cyp.gp.hall.dao.Shoes;
import com.cyp.gp.hall.dao.ShoesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoesMapper {
    int countByExample(ShoesExample example);

    int deleteByExample(ShoesExample example);

    int deleteByPrimaryKey(String shoesid);

    int insert(Shoes record);

    int insertSelective(Shoes record);

    List<Shoes> selectByExample(ShoesExample example);

    Shoes selectByPrimaryKey(String shoesid);

    int updateByExampleSelective(@Param("record") Shoes record, @Param("example") ShoesExample example);

    int updateByExample(@Param("record") Shoes record, @Param("example") ShoesExample example);

    int updateByPrimaryKeySelective(Shoes record);

    int updateByPrimaryKey(Shoes record);
}