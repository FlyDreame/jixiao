package com.youmeek.ssh.dao.impl;

import com.youmeek.ssh.dao.MessageDaoI;

import com.youmeek.ssh.domain.Message;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/8.
 */

@Repository("MessageDao")
public class MessageDaoImpl implements MessageDaoI {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable saveMessage(Message mess) {
        return this.getCurrentSession().save(mess);
    }

    @Override
    public Message getMessage(int id) {
        return (Message) this.getCurrentSession().get(Message.class, id);
    }

    @Override
    public List<Message> getMessageByTo(int toid) {
        Session session = this.getCurrentSession();
        String sql = "from Message mess where mess.toid=?";
        Query q = session.createQuery(sql);
        q.setParameter(0, toid);
        List<Message> mes = q.list();
        return mes;
    }

    @Override
    public void updateMessage(Message mess) {
        this.getCurrentSession().update(mess);
    }
}
