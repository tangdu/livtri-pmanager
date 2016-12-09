package com.livtrip.biz.service;

import com.livtrip.dao.AdminUserDao;
import com.livtrip.model.AdminUserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 管理员接口
 * @author xierongli
 * @version $$Id: livtripmanager-parent, v 0.1 2016/10/12 17:07 user Exp $$
 */
@Service
public class AdminUserService {

    @Resource
    private AdminUserDao adminUserDao;


    public boolean insertAdminUser(AdminUserDO adminUserDO) {
        int insertNum = adminUserDao.insertAdminUser(adminUserDO);
        if(insertNum >0){
            return true;
        }
        return false;
    }

    public boolean deleteAdminUser(Integer id) {
        int deleteNum = adminUserDao.deleteAdminUser(id);
        if(deleteNum > 0){
            return true;
        }
        return false;
    }

}
