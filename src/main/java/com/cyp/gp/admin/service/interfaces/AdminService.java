package com.cyp.gp.admin.service.interfaces;
import com.cyp.gp.admin.dto.*;
import com.cyp.gp.hall.dao.Image;

import java.util.List;

/**
 * Created by admin on 2017/4/17.
 */
public interface AdminService {

    int CheckAdmin(AdminDTO adminDTO);

    List<MenshoesDTO> GetMenShoesToAdminByPage(int page);
    int GetMenShoesCounts();

    List<WomenshoesDTO>GetWomenShoesToAdminByPage(int page);
    int GetWomenShoesCounts();

    List<ChildrenshoesDTO> GetChildrenShoesToAdminByPage(int page);
    int GetChildrenShoesCounts();

    List<MenshoesDTO> GetMenShoesSaleToAdmin(int page);
    int GetMenShoesSaleCounts();

    List<WomenshoesDTO> GetWomenShoesSaleToAdmin(int page);
    int GetWomenShoesSaleCounts();

    List<ChildrenshoesDTO> GetChildrenShoesSaleToAdmin(int page);
    int GetChildrenShoesSaleCounts();

    int AddNewShoesToMenshoes(ShoesDTO shoesDTO);

    int AddNewShoesToWomenshoes(ShoesDTO shoesDTO);

    int AddNewShoesToChildrenshoes(ShoesDTO shoesDTO);

    int AddNewimage(String imageid);

    List<MenshoesDTO> FuzzySerchMenshoesByIndex(String index);

    List<WomenshoesDTO> FuzzySerchWomenshoesByIndex(String index);

    List<ChildrenshoesDTO> FuzzySerchChildrenshoesByIndex(String index);

    int UpdateMenshoes(MenshoesDTO menshoesDTO);

    int UpdateChildrenshoes(ChildrenshoesDTO childrenshoesDTO);

    int UpdateWomenshoes(WomenshoesDTO womenshoesDTO);

    int DeleteMenshoesByid(String shoesid);

    int DeleteWomenenshoesByid(String shoesid);

    int DeleteChildrenshoesByid(String shoesid);

}
