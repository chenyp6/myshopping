package com.cyp.gp.children.service.interfaces;

import com.cyp.gp.children.dto.ChildrenShoesDTO;

import java.util.List;

/**
 * Created by admin on 2017/4/14.
 */
public interface ChildrenService {
    List<ChildrenShoesDTO>  GetChildrenShoesByPage(int page);
}
