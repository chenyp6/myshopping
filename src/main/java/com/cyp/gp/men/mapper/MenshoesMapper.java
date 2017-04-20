package com.cyp.gp.men.mapper;

import com.cyp.gp.men.dao.Menshoes;
import com.cyp.gp.men.dao.MenshoesExample;
import java.util.List;

import com.cyp.gp.men.dto.MenshoesDTO;
import org.apache.ibatis.annotations.Param;

public interface MenshoesMapper {
    int countByExample(MenshoesExample example);

    int deleteByExample(MenshoesExample example);

    int deleteByPrimaryKey(String shoesid);

    int insert(Menshoes record);

    int insertSelective(Menshoes record);

    List<Menshoes> selectByExample(MenshoesExample example);

    List<MenshoesDTO> selectByPage(int page);

    List<Menshoes>  selectToAdminByPage(int page);

    int GetMenShoesCounts();

    Menshoes selectByPrimaryKey(String shoesid);

    int updateByExampleSelective(@Param("record") Menshoes record, @Param("example") MenshoesExample example);

    int updateByExample(@Param("record") Menshoes record, @Param("example") MenshoesExample example);

    int updateByPrimaryKeySelective(Menshoes record);

    int updateByPrimaryKey(Menshoes record);
}