package com.cyp.gp.admin.service.impl;

import com.cyp.gp.admin.dto.ChildrenshoesDTO;
import com.cyp.gp.admin.dto.MenshoesDTO;
import com.cyp.gp.admin.dto.ShoesDTO;
import com.cyp.gp.admin.dto.WomenshoesDTO;
import com.cyp.gp.admin.service.interfaces.AdminService;
import com.cyp.gp.children.dao.Childrenshoes;
import com.cyp.gp.children.mapper.ChildrenshoesMapper;
import com.cyp.gp.hall.dao.Image;
import com.cyp.gp.hall.mapper.ImageMapper;
import com.cyp.gp.men.dao.Menshoes;
import com.cyp.gp.men.mapper.MenshoesMapper;
import com.cyp.gp.women.dao.Womenshoes;
import com.cyp.gp.women.mapper.WomenshoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2017/4/17.
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    MenshoesMapper menshoesMapper;
    @Autowired
    WomenshoesMapper womenshoesMapper;
    @Autowired
    ChildrenshoesMapper childrenshoesMapper;
    @Autowired
    ImageMapper imageMapper;


    public  List<MenshoesDTO> GetMenShoesToAdminByPage(int page){
        List<MenshoesDTO> menshoesDTOs = new LinkedList<MenshoesDTO>();
        List<Menshoes> menshoes=menshoesMapper.selectToAdminByPage(page);
        for (Menshoes t:menshoes){
            MenshoesDTO menshoesDTO=new MenshoesDTO();
            menshoesDTO.setShoesid(t.getShoesid());
            menshoesDTO.setPrice(t.getPrice());
            menshoesDTO.setIntroduction(t.getIntroduction());
            menshoesDTO.setShoeslevel(t.getShoeslevel());
            menshoesDTO.setShoesname(t.getShoesname());
            menshoesDTOs.add(menshoesDTO);
        }
        return menshoesDTOs;
    };
    public  int GetMenShoesCounts(){
        return menshoesMapper.GetMenShoesCounts();
    };

    public List<WomenshoesDTO>GetWomenShoesToAdminByPage(int page){
        List<WomenshoesDTO> womenshoesDTOs = new LinkedList<WomenshoesDTO>();
        List<Womenshoes> womenshoes = womenshoesMapper.selectToAdminByPage(page);
        for(Womenshoes t:womenshoes){
            WomenshoesDTO womenshoesDTO =new WomenshoesDTO();
            womenshoesDTO.setShoesid(t.getShoesid());
            womenshoesDTO.setShoesname(t.getShoesname());
            womenshoesDTO.setShoeslevel(t.getShoeslevel());
            womenshoesDTO.setPrice(t.getPrice());
            womenshoesDTO.setIntroduction(t.getIntroduction());
            womenshoesDTOs.add(womenshoesDTO);
        }
        return womenshoesDTOs;
    }
    public int GetWomenShoesCounts(){
        return womenshoesMapper.GetWomenShoesCounts();
    }

    public List<ChildrenshoesDTO> GetChildrenShoesToAdminByPage(int page){
        List<ChildrenshoesDTO> childrenshoesDTOs=new LinkedList<ChildrenshoesDTO>();
        List<Childrenshoes> childrenshoes = childrenshoesMapper.selectToAdminByPage(page);
        for (Childrenshoes t: childrenshoes){
            ChildrenshoesDTO childrenshoesDTO=new ChildrenshoesDTO();
            childrenshoesDTO.setShoesid(t.getShoesid());
            childrenshoesDTO.setShoesname(t.getShoesname());
            childrenshoesDTO.setPrice(t.getPrice());
            childrenshoesDTO.setIntroduction(t.getIntroduction());
            childrenshoesDTO.setShoeslevel(t.getShoeslevel());
            childrenshoesDTOs.add(childrenshoesDTO);
        }
        return  childrenshoesDTOs;
    }
    public int GetChildrenShoesCounts(){
        return childrenshoesMapper.GetChildrenShoesCounts();
    }

    public int AddNewShoesToMenshoes(ShoesDTO shoesDTO){
        int i=0;
        Menshoes menshoes=new Menshoes();
        menshoes.setShoesid(shoesDTO.getShoesid());
        menshoes.setShoesname(shoesDTO.getShoesname());
        menshoes.setPrice(shoesDTO.getPrice());
        menshoes.setIntroduction(shoesDTO.getIntroduction());
        menshoes.setShoeslevel(shoesDTO.getShoeslevel());
        if (menshoesMapper.insert(menshoes)==1){
            i=1;
        }

        return i;
    }

    public int AddNewShoesToWomenshoes(ShoesDTO shoesDTO){
        int i=0;
        Womenshoes womenshoes =new Womenshoes();
        womenshoes.setShoesid(shoesDTO.getShoesid());
        womenshoes.setShoesname(shoesDTO.getShoesname());
        womenshoes.setPrice(shoesDTO.getPrice());
        womenshoes.setIntroduction(shoesDTO.getIntroduction());
        womenshoes.setShoeslevel(shoesDTO.getShoeslevel());
        if(womenshoesMapper.insert(womenshoes)=='1'){
            i=1;
        }

        return i;
    }

    public int AddNewShoesToChildrenshoes(ShoesDTO shoesDTO){
        int i=0;
        Childrenshoes childrenshoes = new Childrenshoes();
        childrenshoes.setShoesid(shoesDTO.getShoesid());
        childrenshoes.setShoesname(shoesDTO.getShoesname());
        childrenshoes.setPrice(shoesDTO.getPrice());
        childrenshoes.setIntroduction(shoesDTO.getIntroduction());
        childrenshoes.setShoeslevel(shoesDTO.getShoeslevel());
        if(childrenshoesMapper.insert(childrenshoes)=='1'){
            i=1;
        }

        return i;
    }

    public int AddNewimage(String imageid){
        int i=0;
        Image image = new Image();
        image.setImageid(imageid);
        image.setIndeximage("/images/"+imageid.substring(0,6)+0+".jpg");
        image.setImageshow("/images/"+imageid.substring(0,6)+1+".jpg");
        image.setImageshow1("/images/"+imageid.substring(0,6)+2+".jpg");
        image.setImageshow2("/images/"+imageid.substring(0,6)+3+".jpg");
        image.setImageshow3("/images/"+imageid.substring(0,6)+4+".jpg");
        if (imageMapper.insert(image)==1){
            i=1;
        }
        return i;
    }

    public List<MenshoesDTO> FuzzySerchMenshoesByIndex(String index){
        List<MenshoesDTO> menshoesDTOs = new LinkedList<MenshoesDTO>();
        List<Menshoes> menshoes =menshoesMapper.FuzzySerchByIndex(index);
        for(Menshoes t : menshoes){
            MenshoesDTO menshoesDTO = new MenshoesDTO();
            menshoesDTO.setShoesname(t.getShoesname());
            menshoesDTO.setShoesid(t.getShoesid());
            menshoesDTO.setShoeslevel(t.getShoeslevel());
            menshoesDTO.setIntroduction(t.getIntroduction());
            menshoesDTO.setPrice(t.getPrice());
            menshoesDTOs.add(menshoesDTO);
        }
        return menshoesDTOs;
    }

    public List<WomenshoesDTO> FuzzySerchWomenshoesByIndex(String index){
        List<WomenshoesDTO> womenshoesDTOs = new LinkedList<WomenshoesDTO>();
        List<Womenshoes> womenshoes=womenshoesMapper.FuzzySerchByIndex(index);
        for (Womenshoes t : womenshoes){
            WomenshoesDTO womenshoesDTO=new WomenshoesDTO();
            womenshoesDTO.setShoesid(t.getShoesid());
            womenshoesDTO.setShoesname(t.getShoesname());
            womenshoesDTO.setPrice(t.getPrice());
            womenshoesDTO.setShoeslevel(t.getShoeslevel());
            womenshoesDTO.setIntroduction(t.getIntroduction());
            womenshoesDTOs.add(womenshoesDTO);
        }
        return  womenshoesDTOs;
    }

    public List<ChildrenshoesDTO> FuzzySerchChildrenshoesByIndex(String index){
        List<ChildrenshoesDTO> childrenshoesDTOs = new LinkedList<ChildrenshoesDTO>();
        List<Childrenshoes> childrenshoes = childrenshoesMapper.FuzzySerchByIndex(index);
        for(Childrenshoes t : childrenshoes){
            ChildrenshoesDTO childrenshoesDTO= new ChildrenshoesDTO();
            childrenshoesDTO.setShoesid(t.getShoesid());
            childrenshoesDTO.setShoesname(t.getShoesname());
            childrenshoesDTO.setShoeslevel(t.getShoeslevel());
            childrenshoesDTO.setIntroduction(t.getIntroduction());
            childrenshoesDTO.setPrice(t.getPrice());
            childrenshoesDTOs.add(childrenshoesDTO);
        }
        return childrenshoesDTOs;
    }

    public int UpdateMenshoes(MenshoesDTO menshoesDTO){
        Menshoes menshoes =new Menshoes();
        menshoes.setShoesid(menshoesDTO.getShoesid());
        menshoes.setShoesname(menshoesDTO.getShoesname());
        menshoes.setIntroduction(menshoesDTO.getIntroduction());
        menshoes.setShoeslevel(menshoesDTO.getShoeslevel());
        menshoes.setPrice(menshoesDTO.getPrice());
        return menshoesMapper.updateByPrimaryKey(menshoes);
    }

    public  int UpdateChildrenshoes(ChildrenshoesDTO childrenshoesDTO){
        Childrenshoes childrenshoes = new Childrenshoes();
        childrenshoes.setShoesid(childrenshoesDTO.getShoesid());
        childrenshoes.setShoesname(childrenshoesDTO.getShoesname());
        childrenshoes.setPrice(childrenshoesDTO.getPrice());
        childrenshoes.setIntroduction(childrenshoesDTO.getIntroduction());
        childrenshoes.setShoeslevel(childrenshoesDTO.getShoeslevel());
        return childrenshoesMapper.updateByPrimaryKey(childrenshoes);
    }

    public int UpdateWomenshoes(WomenshoesDTO womenshoesDTO){
        Womenshoes womenshoes = new Womenshoes();
        womenshoes.setShoesid(womenshoesDTO.getShoesid());
        womenshoes.setShoesname(womenshoesDTO.getShoesname());
        womenshoes.setPrice(womenshoesDTO.getPrice());
        womenshoes.setIntroduction(womenshoesDTO.getIntroduction());
        womenshoes.setShoeslevel(womenshoesDTO.getShoeslevel());
        return womenshoesMapper.updateByPrimaryKey(womenshoes);
    }
}
