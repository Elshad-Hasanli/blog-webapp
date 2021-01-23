package com.hasanli.service.impl;

import com.hasanli.dao.inter.AdminsRespository;
import com.hasanli.entity.Admins;
import com.hasanli.service.inter.AdminsServiceInter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AdminsServiceImpl implements AdminsServiceInter {
    @Autowired
    AdminsRespository adminsRespository;

    @Override
    public List<Admins> getAllAdmin() {
        return adminsRespository.findAll();
    }

    @Override
    public boolean updateAdmin(Admins admin) {
        Admins result=adminsRespository.save(admin);
        if(result!=null){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean addAdmin(Admins admin) {
        List<Admins> admins=adminsRespository.findAll();
        for(Admins findedAdmin:admins){
            if(findedAdmin.getEmail().equals(admin.getEmail())){
                return false;
            }

        }
        Admins savedAdmin=adminsRespository.save(admin);
        if(savedAdmin==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int deleteAdmin(Integer id) {
        adminsRespository.deleteById(id);

        if( adminsRespository.findById(id)==null){
            return 0;
        }else {
            return 1;
        }

    }

    @Override
    public List<Admins> findAdmin(String name) {
       List<Admins> admins=adminsRespository.findByNameContainingIgnoreCase(name);
       return admins;
    }
}
