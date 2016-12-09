/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.livtrip.dao;


import com.livtrip.model.AdminUserDO;
import org.apache.ibatis.annotations.Param;

public interface AdminUserDao {

    /**
     * 新增管理员
     * @param adminUserDO
     * @return
     */
    int insertAdminUser(AdminUserDO adminUserDO);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    int deleteAdminUser(@Param("id") Integer id);


}
