package com.youmeek.ssh.dao.impl;


import com.youmeek.ssh.domain.SysUser;
import com.youmeek.ssh.dao.UserDaoI;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Judas.n 2014年4月6日 22:49:47
 */
@Repository("userDao")
public class UserDaoImpl implements UserDaoI {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //2014年4月4日 00:15:20直接只使用@Autowired,这里提示sessionFactory没办法注入，必须再加上@Qualifier
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    /**
     * 保存用户
     *
     * @param user
     * @return
     */
    @Override
    public Serializable saveUser(SysUser user) {
        return this.getCurrentSession().save(user);
    }

    /**
     * 通过ID查询用户信息
     *
     * @param userId
     * @return
     */
    @Override
    public SysUser getUser(int userId) {
        return (SysUser) this.getCurrentSession().get(SysUser.class, userId);
    }

    /**
     * 通过用户名查询用户信息
     *
     * @param username
     * @return
     */
    @Override
    public SysUser getUserByName(String username) {
        Session session = this.getCurrentSession();
        String sqlstr = "from SysUser u where u.username=?";
        Query q = session.createQuery(sqlstr);
        q.setParameter(0, username);
        List<SysUser> userlist = q.list();
        return (SysUser) userlist.get(0);
    }

    @Override
    public List<SysUser> getAllUser() {
        return (List<SysUser>) this.getCurrentSession().createQuery("from SysUser u").list();
    }

    @Override
    public void updateUser(SysUser user) {
        this.getCurrentSession().update(user);
    }


}
