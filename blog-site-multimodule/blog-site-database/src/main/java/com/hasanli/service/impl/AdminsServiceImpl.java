package com.hasanli.service.impl;

import com.hasanli.dao.inter.AdminsRespository;
import com.hasanli.entity.Admins;
import com.hasanli.service.inter.AdminsServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminsServiceImpl implements AdminsServiceInter {
    @Autowired
    AdminsRespository adminsRespository;

    @Override
    public List<Admins> getAllAdmin() {
        List<Admins> allAdmins=adminsRespository.findAll();
        return allAdmins;
    }

    @Override
    public boolean updateAdmin(Admins admin) {

        try {
            adminsRespository.save(admin);
            return true;
        }catch (Exception ex){
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
            return 1;
        }else {
            return 0;
        }

    }

    @Override
    public List<Admins> findAdmin(String name) {
       List<Admins> admins=adminsRespository.findByNameContainingIgnoreCase(name);
       return admins;
    }
}
