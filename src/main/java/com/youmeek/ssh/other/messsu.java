package com.youmeek.ssh.other;


import java.sql.Date;
import java.sql.Time;

/**
 * Created by liumeng on 2016/1/9.
 */
public class messsu {
    private int fromid;
    private int messid;
    private Date date;
    private Time time;
    private String fromname;
    private int check;
    private String content;

    public int getFromid() {
        return fromid;
    }

    public int getMessid() {
        return messid;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getFromname() {
        return fromname;
    }

    public int getCheck() {
        return check;
    }

    public String getContent() {
        return content;
    }

    public void setFromid(int fromid) {
        this.fromid = fromid;
    }

    public void setMessid(int messid) {
        this.messid = messid;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
