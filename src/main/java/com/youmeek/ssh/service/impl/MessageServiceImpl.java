package com.youmeek.ssh.service.impl;

import com.youmeek.ssh.dao.MessageDaoI;
import com.youmeek.ssh.domain.Message;
import com.youmeek.ssh.service.MessageServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liumeng on 2016/1/8.
 */
@Service
public class MessageServiceImpl implements MessageServiceI {

    @Autowired
    public MessageDaoI messageDao;

    @Override
    public Serializable saveMessage(Message mess) {
        return messageDao.saveMessage(mess);
    }

    @Override
    public Message getMessage(int id) {
        return messageDao.getMessage(id);
    }

    @Override
    public List<Message> getMessageByTo(int toid) {
        return messageDao.getMessageByTo(toid);
    }

    @Override
    public void updateMessage(Message mess) {
        messageDao.updateMessage(mess);
    }

}
