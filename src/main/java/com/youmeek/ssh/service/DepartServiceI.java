package com.youmeek.ssh.service;

import java.io.Serializable;

import com.youmeek.ssh.domain.Depart;

/**
 * Created by liumeng on 2016/1/6.
 */
public interface DepartServiceI {
    public Serializable saveDepart(Depart de);

    public Depart getDepart(int deid);

}
