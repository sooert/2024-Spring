package com.my.ds_open_market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_open_market.dao.ItemImgDao;
import com.my.ds_open_market.entity.ItemImg;

@Service
public class ItemImgService {

    @Autowired
    private ItemImgDao itemImgDao;

    public int save(ItemImg itemImg){
        return itemImgDao.save(itemImg);
    }   

}