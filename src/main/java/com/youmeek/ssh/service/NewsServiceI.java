package com.youmeek.ssh.service;

import com.youmeek.ssh.domain.News;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/9.
 */
public interface NewsServiceI {
    public Serializable saveNews(News news);

    public News getNews(int id);

    public List<News> getNewsByTo(int id);

    public void updateNews(News news);
}
