package com.cyp.gp.admin.controller;

import com.cyp.gp.admin.dto.ChildrenshoesDTO;
import com.cyp.gp.admin.dto.MenshoesDTO;
import com.cyp.gp.admin.dto.ShoesDTO;
import com.cyp.gp.admin.dto.WomenshoesDTO;
import com.cyp.gp.admin.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * Created by admin on 2017/4/17.
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/admin")
    public String admin(){
        return "admin/admin";
    }

    @RequestMapping("/querymenshoestoadmin")
    @ResponseBody
    public ModelMap queryadmin(String page){
        ModelMap model=new ModelMap();
        List<MenshoesDTO> menshoesDTOs=adminService.GetMenShoesToAdminByPage((Integer.parseInt(page)-1)*10);
        int menshoescounts =adminService.GetMenShoesCounts();
        model.addAttribute("menshoesDTOs",menshoesDTOs);
        model.addAttribute("menshoescounts",menshoescounts);
        return model;
    }

    @RequestMapping("querywomenshoestoadmin")
    @ResponseBody
    public ModelMap querywomenshoestoadmin(String page){
        ModelMap model=new ModelMap();
        List<WomenshoesDTO> womenshoesDTOs=adminService.GetWomenShoesToAdminByPage((Integer.parseInt(page)-1)*10);
        int womenshoescounts=adminService.GetWomenShoesCounts();
        model.addAttribute("womenshoesDTOs",womenshoesDTOs);
        model.addAttribute("womenshoescounts",womenshoescounts);
        return model;
    }

    @RequestMapping("/querychildrenshoestoadmin")
    @ResponseBody
    public ModelMap querychildrenshoestoadmin(String page){
        ModelMap model=new ModelMap();
        List<ChildrenshoesDTO> childrenshoesDTOs= adminService.GetChildrenShoesToAdminByPage((Integer.parseInt(page)-1)*10);
        int childrenshoescounts=adminService.GetChildrenShoesCounts();
        model.addAttribute("childrenshoesDTOs",childrenshoesDTOs);
        model.addAttribute("childrenshoescounts",childrenshoescounts);
        return model;
    }

    @RequestMapping("/addnewshoes")
    @ResponseBody
    public ModelMap addnewshoes(ShoesDTO shoesDTO, @RequestParam MultipartFile[] showimage) throws Exception{
        int i=0;
        ModelMap model=new ModelMap();
        String img_path="G:\\workspace\\myshopping\\src\\main\\webapp\\images\\";
        for(MultipartFile t:showimage){
            String originalFilename = t.getOriginalFilename();
            String newFileName = shoesDTO.getShoesid().substring(0,6)+i+originalFilename.substring(originalFilename.lastIndexOf("."));
            File newfile = new File(img_path+newFileName);
            t.transferTo(newfile);
            i++;
        }
        if (shoesDTO.getShoestype().equals("menshoes")){
            if(adminService.AddNewShoesToMenshoes(shoesDTO)==1) {
                i=1;
            }
        }else if (shoesDTO.getShoestype().equals("womenshoes")){
            if(adminService.AddNewShoesToWomenshoes(shoesDTO)==1){
                i=1;
            }

        }else if (shoesDTO.getShoestype().equals("childrenshoes")){
            if(adminService.AddNewShoesToChildrenshoes(shoesDTO)==1){
                i=1;
            }
        }
            if(adminService.AddNewimage(shoesDTO.getShoesid())==1&&i==1){
                model.addAttribute("msg","1");
            }else{
                model.addAttribute("msg","0");
            }

        return model;
    }

    @RequestMapping("/fuzzyserchmenshoes")
    @ResponseBody
    public ModelMap fuzzyserchmenshoes(String index){
        ModelMap model=new ModelMap();
        List<MenshoesDTO> menshoesDTOs = adminService.FuzzySerchMenshoesByIndex(index);
        model.addAttribute("menshoesDTOs",menshoesDTOs);
        return model;
    }

    @RequestMapping("/fuzzyserchwomenshoes")
    @ResponseBody
    public ModelMap fuzzyserchwomenshoes(String index){
        ModelMap model=new ModelMap();
        List<WomenshoesDTO> womenshoesDTOs =adminService.FuzzySerchWomenshoesByIndex(index);
        model.addAttribute("womenshoesDTOs",womenshoesDTOs);
        return model;
    }

    @RequestMapping("/fuzzyserchchildrenshoes")
    @ResponseBody
    public ModelMap fuzzyserchchildremshoes(String index){
        ModelMap model=new ModelMap();
        List<ChildrenshoesDTO> childrenshoesDTOs = adminService.FuzzySerchChildrenshoesByIndex(index);
        model.addAttribute("childrenshoesDTOs",childrenshoesDTOs);
        return model;
    }
}
