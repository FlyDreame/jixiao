package com.youmeek.ssh.service;

import java.io.Serializable;
import java.util.List;

import com.youmeek.ssh.domain.SysUser;

/**
 * @author Judas.n 2014年4月6日 22:49:26
 */
public interface UserServiceI {

    public Serializable saveUser(SysUser user);

    public SysUser getUser(int userId);

    public SysUser getUserByName(String username);

    public List<SysUser> getAllUser();

    public void updateUser(SysUser user);

}
