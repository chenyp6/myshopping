package com.cyp.gp.children.service.impl;

import com.cyp.gp.children.dto.ChildrenShoesDTO;
import com.cyp.gp.children.mapper.ChildrenshoesMapper;
import com.cyp.gp.children.service.interfaces.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/4/14.
 */
@Service
public class ChildrenServiceImpl implements ChildrenService{
    @Autowired
    ChildrenshoesMapper childrenshoesMapper;

    public List<ChildrenShoesDTO> GetChildrenShoesByPage(int page) {
        List<ChildrenShoesDTO> childrenShoesDTOs=childrenshoesMapper.selectByPage(page);
        return childrenShoesDTOs;
    }
}
