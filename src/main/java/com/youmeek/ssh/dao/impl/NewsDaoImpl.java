package com.youmeek.ssh.dao.impl;

import com.youmeek.ssh.dao.NewsDaoI;
import com.youmeek.ssh.domain.News;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/9.
 */
@Repository("NewsDao")
public class NewsDaoImpl implements NewsDaoI {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable saveNews(News news) {
        return this.getCurrentSession().save(news);
    }

    @Override
    public News getNews(int id) {
        return (News) this.getCurrentSession().get(News.class, id);
    }

    @Override
    public List<News> getNewsByTo(int id) {
        Session session = this.getCurrentSession();
        String sql = "from News n where n.toid=?";
        Query q = session.createQuery(sql);
        q.setParameter(0, id);
        List<News> ns = q.list();
        return ns;
    }

    @Override
    public void updateNews(News news) {
        this.getCurrentSession().update(news);
    }
}
