package com.hasanli.service.inter;

import com.hasanli.entity.Admins;

import java.util.List;

public interface AdminsServiceInter {
    public List<Admins> getAllAdmin();
    public boolean updateAdmin(Admins admin);
    public boolean addAdmin(Admins admin);
    public int deleteAdmin(Integer id);
    public List<Admins> findAdmin(String name);
}
