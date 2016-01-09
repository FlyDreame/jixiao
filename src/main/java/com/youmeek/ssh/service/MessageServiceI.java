package com.youmeek.ssh.service;

import com.youmeek.ssh.domain.Message;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/8.
 */
public interface MessageServiceI {
    public Serializable saveMessage(Message mess);

    public Message getMessage(int id);

    public List<Message> getMessageByTo(int toid);

    public void updateMessage(Message mess);
}
