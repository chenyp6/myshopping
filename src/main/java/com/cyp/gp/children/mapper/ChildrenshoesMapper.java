package com.cyp.gp.children.mapper;

import com.cyp.gp.children.dao.Childrenshoes;
import com.cyp.gp.children.dao.ChildrenshoesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChildrenshoesMapper {
    int countByExample(ChildrenshoesExample example);

    int deleteByExample(ChildrenshoesExample example);

    int deleteByPrimaryKey(String shoesid);

    int insert(Childrenshoes record);

    int insertSelective(Childrenshoes record);

    List<Childrenshoes> selectByExample(ChildrenshoesExample example);

    Childrenshoes selectByPrimaryKey(String shoesid);

    int updateByExampleSelective(@Param("record") Childrenshoes record, @Param("example") ChildrenshoesExample example);

    int updateByExample(@Param("record") Childrenshoes record, @Param("example") ChildrenshoesExample example);

    int updateByPrimaryKeySelective(Childrenshoes record);

    int updateByPrimaryKey(Childrenshoes record);
}