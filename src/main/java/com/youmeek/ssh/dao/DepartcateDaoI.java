package com.youmeek.ssh.dao;

import java.io.Serializable;
import java.util.List;

import com.youmeek.ssh.domain.Departcate;

/**
 * Created by liumeng on 2016/1/6.
 */
public interface DepartcateDaoI {
    public Serializable saveDepartcate(Departcate decate);

    public Departcate getDepartcate(int decateid);

    public List<Departcate> getAllDepartcate();
}
