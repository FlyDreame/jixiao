package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.dao.NewsDaoI;
import com.youmeek.ssh.domain.News;
import com.youmeek.ssh.service.NewsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/9.
 */
@Service
public class NewsServiceImpl implements NewsServiceI {

    @Autowired
    public NewsDaoI newsDao;

    @Override
    public Serializable saveNews(News news) {
        return newsDao.saveNews(news);
    }

    @Override
    public News getNews(int id) {
        return newsDao.getNews(id);
    }

    @Override
    public List<News> getNewsByTo(int id) {
        return newsDao.getNewsByTo(id);
    }

    @Override
    public void updateNews(News news) {
        newsDao.updateNews(news);
    }
}
