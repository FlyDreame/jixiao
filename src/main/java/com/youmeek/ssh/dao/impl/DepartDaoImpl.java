package com.youmeek.ssh.dao.impl;

import com.youmeek.ssh.dao.DepartDaoI;
import com.youmeek.ssh.domain.Depart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by liumeng on 2016/1/6.
 */
@Repository
public class DepartDaoImpl implements DepartDaoI {

    @Autowired
    private SessionFactory sessionFactory;


    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @Override
    public Serializable saveDepart(Depart de) {
        return this.getCurrentSession().save(de);
    }

    @Override
    public Depart getDepart(int deid) {
        return (Depart) this.getCurrentSession().get(Depart.class, deid);
    }
}
