package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.domain.Depart;
import com.youmeek.ssh.dao.DepartDaoI;
import com.youmeek.ssh.service.DepartServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by liumeng on 2016/1/6.
 */
@Service
public class DepartServiceImpl implements DepartServiceI {

    @Autowired
    private DepartDaoI departDao;


    @Override
    public Serializable saveDepart(Depart de) {
        return departDao.saveDepart(de);
    }

    @Override
    public Depart getDepart(int deid) {
        return departDao.getDepart(deid);
    }
}
