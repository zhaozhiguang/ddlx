package cn.ddsxy.ddlx.service.impl;

import cn.ddsxy.ddlx.dao.Admin;
import cn.ddsxy.ddlx.service.AdminService;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {


    public Admin queryAdmin() {
        return new Admin();
    }
}
