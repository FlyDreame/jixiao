package com.youmeek.ssh.dao.impl;

import com.youmeek.ssh.dao.DepartcateDaoI;
import com.youmeek.ssh.domain.Departcate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/6.
 */
@Repository("DepartcateDao")
public class DepartcateDaoImpl implements DepartcateDaoI {

    @Autowired
    private SessionFactory sessionFactory;


    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable saveDepartcate(Departcate decate) {
        return this.getCurrentSession().save(decate);
    }

    @Override
    public Departcate getDepartcate(int decateid) {
        return (Departcate) this.getCurrentSession().get(Departcate.class, decateid);
    }

    @Override
    public List<Departcate> getAllDepartcate() {
        return (List<Departcate>) this.getCurrentSession().createQuery("from Departcate de").list();
    }
}
