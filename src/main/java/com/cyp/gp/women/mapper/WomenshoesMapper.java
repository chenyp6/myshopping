package com.cyp.gp.women.mapper;

import com.cyp.gp.women.dao.Womenshoes;
import com.cyp.gp.women.dao.WomenshoesExample;
import java.util.List;

import com.cyp.gp.women.dto.WomenshoesDTO;
import org.apache.ibatis.annotations.Param;

public interface WomenshoesMapper {
    int countByExample(WomenshoesExample example);

    int deleteByExample(WomenshoesExample example);

    int deleteByPrimaryKey(String shoesid);

    int insert(Womenshoes record);

    int insertSelective(Womenshoes record);

    List<Womenshoes> selectByExample(WomenshoesExample example);
    
    List<WomenshoesDTO> selectByPage(int page);

    List<Womenshoes> selectSaledToAdminByPage(int page);
    
    List<Womenshoes> selectToAdminByPage(int page);

    List<Womenshoes> FuzzySerchByIndex(String index);
    
    int GetWomenShoesCounts();

    Womenshoes selectByPrimaryKey(String shoesid);

    int updateByExampleSelective(@Param("record") Womenshoes record, @Param("example") WomenshoesExample example);

    int updateByExample(@Param("record") Womenshoes record, @Param("example") WomenshoesExample example);

    int updateByPrimaryKeySelective(Womenshoes record);

    int updateByPrimaryKey(Womenshoes record);
}