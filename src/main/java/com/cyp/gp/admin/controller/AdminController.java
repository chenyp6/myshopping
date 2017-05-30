package com.cyp.gp.admin.controller;

import com.cyp.gp.admin.dto.*;
import com.cyp.gp.admin.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * Created by admin on 2017/4/17.
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    /*@RequestMapping("/adminhall")
    public String adminhall(){
        return "admin/adminhall";
    }*/

    @RequestMapping("/admin")
    public String admin(){
        return "admin/admin";
    }

    @RequestMapping("/checkadmin")
    public String checkadmin(AdminDTO adminDTO,ModelMap model){
        model.addAttribute("adminid",adminDTO.getUserid());
        if(adminService.CheckAdmin(adminDTO)==1){
            return "admin/adminhall";
        }
        else{
            return "admin/admin";
        }
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

    @RequestMapping("/changemenshoesmsg")
    @ResponseBody
    public ModelMap changemenshoesmsg(MenshoesDTO menshoesDTO){
        ModelMap model=new ModelMap();
        if(adminService.UpdateMenshoes(menshoesDTO)==1){
            model.addAttribute("msg","1");
        }else{
            model.addAttribute("msg","0");
        }
        return model;
    }

    @RequestMapping("/changechildrenshoesmsg")
    @ResponseBody
    public ModelMap changechildrenshoesmsg(ChildrenshoesDTO childrenshoesDTO){
        ModelMap model=new ModelMap();
        if(adminService.UpdateChildrenshoes(childrenshoesDTO)==1){
            model.addAttribute("msg","1");
        }else{
            model.addAttribute("msg","0");
        }
        return model;
    }

    @RequestMapping("/changewomenshoesmsg")
    @ResponseBody
    public ModelMap changewomenshoesmsg(WomenshoesDTO womenshoesDTO){
        ModelMap model=new ModelMap();
        if(adminService.UpdateWomenshoes(womenshoesDTO)==1){
            model.addAttribute("msg","1");
        }else{
            model.addAttribute("msg","0");
        }
        return model;
    }

    @RequestMapping("/querymenshoessaletoadmin")
    @ResponseBody
    public ModelMap querymenshoessaletoadmin(String page){
        ModelMap model=new ModelMap();
        int menshoessalecounts=adminService.GetMenShoesSaleCounts();
        List<MenshoesDTO> menshoesDTOs = adminService.GetMenShoesSaleToAdmin((Integer.parseInt(page)-1)*10);
        model.addAttribute("menshoessaleDTOs",menshoesDTOs);
        model.addAttribute("menshoessalecounts",menshoessalecounts);
        return model;
    }

    @RequestMapping("/fuzzyserchmenshoessale")
    @ResponseBody
    public ModelMap fuzzyserchmenshoessale(String index){
        ModelMap model=new ModelMap();
        List<MenshoesDTO> menshoesDTOs = adminService.FuzzySerchMenshoesByIndex(index);
        model.addAttribute("menshoessaleDTOs",menshoesDTOs);
        return model;
    }

    @RequestMapping("/querywomenshoessaletoadmin")
    @ResponseBody
    public ModelMap querywomenshoessaletoadmin(String page){
        ModelMap model=new ModelMap();
        int womenshoessalecounts=adminService.GetWomenShoesSaleCounts();
        List<WomenshoesDTO> womenshoesDTOs = adminService.GetWomenShoesSaleToAdmin((Integer.parseInt(page)-1)*10);
        model.addAttribute("womenshoessaleDTOs",womenshoesDTOs);
        model.addAttribute("womenshoessalecounts",womenshoessalecounts);
        return model;
    }

    @RequestMapping("/fuzzyserchwomenshoessale")
    @ResponseBody
    public ModelMap fuzzyserchwomenshoessale(String index){
        ModelMap model=new ModelMap();
        List<WomenshoesDTO> womenshoesDTOs = adminService.FuzzySerchWomenshoesByIndex(index);
        model.addAttribute("womenshoessaleDTOs",womenshoesDTOs);
        return model;
    }

    @RequestMapping("/querychildrenshoessaletoadmin")
    @ResponseBody
    public ModelMap querychildrenshoessaletoadmin(String page){
        ModelMap model=new ModelMap();
        int childrenshoessalecounts=adminService.GetChildrenShoesCounts();
        List<ChildrenshoesDTO> childrenshoesDTOs = adminService.GetChildrenShoesSaleToAdmin((Integer.parseInt(page)-1)*10);
        model.addAttribute("childrenshoessaleDTOs",childrenshoesDTOs);
        model.addAttribute("childrenshoessalecounts",childrenshoessalecounts);
        return model;
    }

    @RequestMapping("/fuzzyserchchildrenshoessale")
    @ResponseBody
    public ModelMap fuzzyserchchildrenshoessale(String index){
        ModelMap model=new ModelMap();
        List<ChildrenshoesDTO> childrenshoesDTOs = adminService.FuzzySerchChildrenshoesByIndex(index);
        model.addAttribute("childrenshoessaleDTOs",childrenshoesDTOs);
        return model;
    }

    @RequestMapping("/deletemenshoes")
    @ResponseBody
    public ModelMap deletemenshoes(String page,String shoesid){
        ModelMap model=new ModelMap();
        model.addAttribute("msg",adminService.DeleteMenshoesByid(shoesid));
        List<MenshoesDTO> menshoesDTOs=adminService.GetMenShoesToAdminByPage((Integer.parseInt(page)-1)*10);
        model.addAttribute("menshoesDTOs",menshoesDTOs);
        return model;
    }

    @RequestMapping("/deletechildrenshoes")
    @ResponseBody
    public ModelMap deletechildrenshoes(String page,String shoesid){
        ModelMap model=new ModelMap();
        model.addAttribute("msg",adminService.DeleteChildrenshoesByid(shoesid));
        List<ChildrenshoesDTO> childrenshoesDTOs=adminService.GetChildrenShoesToAdminByPage((Integer.parseInt(page)-1)*10);
        model.addAttribute("childrenshoesDTOs",childrenshoesDTOs);
        return model;
    }

    @RequestMapping("/deletewomenshoes")
    @ResponseBody
    public ModelMap deletewomenshoes(String page,String shoesid){
        ModelMap model=new ModelMap();
        model.addAttribute("msg",adminService.DeleteWomenenshoesByid(shoesid));
        List<WomenshoesDTO> womenshoesDTOs=adminService.GetWomenShoesToAdminByPage((Integer.parseInt(page)-1)*10);
        model.addAttribute("womenshoesDTOs",womenshoesDTOs);
        return model;
    }

}
