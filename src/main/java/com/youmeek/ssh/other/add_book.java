package com.youmeek.ssh.other;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liumeng on 2016/1/8.
 */
public class add_book {
    private int id;//部门分类id
    private String name;//部门分类名称
    private List<book_user> bu = new ArrayList<book_user>();//用户信息

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<book_user> getBu() {
        return this.bu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBu(book_user bu) {
        this.bu.add(bu);
    }
}
