package com.my.ds_open_market.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ds_open_market.dao.ItemDao;
import com.my.ds_open_market.entity.Item;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;


    public List<Item> findAll(){
        return itemDao.findAll();
    }

    public int save(Item item) {
        return itemDao.save(item); 
    }
    

}