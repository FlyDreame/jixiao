package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.domain.Departcate;
import com.youmeek.ssh.service.DepartcateServiceI;
import com.youmeek.ssh.dao.DepartcateDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by liumeng on 2016/1/6.
 */
@Service
public class DepartcateServiceImpl implements DepartcateServiceI {

    private DepartcateDaoI departcateDao;


    @Override
    public Serializable saveDepartcate(Departcate decate) {
        return departcateDao.saveDepartcate(decate);
    }

    @Override
    public Departcate getDepartcate(int decateid) {
        return departcateDao.getDepartcate(decateid);
    }
}
