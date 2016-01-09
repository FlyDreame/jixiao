package com.youmeek.ssh.dao;

import com.youmeek.ssh.domain.Message;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/8.
 */
public interface MessageDaoI {
    public Serializable saveMessage(Message mess);

    public Message getMessage(int id);

    public List<Message> getMessageByTo(int toid);

    public void updateMessage(Message mess);
}
