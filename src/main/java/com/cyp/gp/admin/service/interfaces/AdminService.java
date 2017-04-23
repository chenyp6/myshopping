package com.cyp.gp.admin.service.interfaces;

import com.cyp.gp.admin.dto.ChildrenshoesDTO;
import com.cyp.gp.admin.dto.MenshoesDTO;
import com.cyp.gp.admin.dto.ShoesDTO;
import com.cyp.gp.admin.dto.WomenshoesDTO;
import com.cyp.gp.hall.dao.Image;

import java.util.List;

/**
 * Created by admin on 2017/4/17.
 */
public interface AdminService {
    List<MenshoesDTO> GetMenShoesToAdminByPage(int page);
    int GetMenShoesCounts();

    List<WomenshoesDTO>GetWomenShoesToAdminByPage(int page);
    int GetWomenShoesCounts();

    List<ChildrenshoesDTO> GetChildrenShoesToAdminByPage(int page);
    int GetChildrenShoesCounts();

    int AddNewShoesToMenshoes(ShoesDTO shoesDTO);

    int AddNewShoesToWomenshoes(ShoesDTO shoesDTO);

    int AddNewShoesToChildrenshoes(ShoesDTO shoesDTO);

    int AddNewimage(String imageid);

    List<MenshoesDTO> FuzzySerchMenshoesByIndex(String index);

    List<WomenshoesDTO> FuzzySerchWomenshoesByIndex(String index);

    List<ChildrenshoesDTO> FuzzySerchChildrenshoesByIndex(String index);

}
