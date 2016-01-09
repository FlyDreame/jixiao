package com.youmeek.ssh.dao;

import java.io.Serializable;
import java.util.List;

import com.youmeek.ssh.domain.Depart;

/**
 * Created by liumeng on 2016/1/6.
 */
public interface DepartDaoI {
    public Serializable saveDepart(Depart de);

    public Depart getDepart(int deid);

}
