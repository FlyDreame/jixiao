package com.youmeek.ssh.dao;

import java.io.Serializable;

import com.youmeek.ssh.domain.Departcate;

/**
 * Created by liumeng on 2016/1/6.
 */
public interface DepartcateDaoI {
    public Serializable saveDepartcate(Departcate decate);

    public Departcate getDepartcate(int decateid);
}
