package com.youmeek.ssh.domain;

import javax.persistence.*;

/**
 * Created by liumeng on 2016/1/6.
 */
@Entity
@Table(name = "department", schema = "kaohe", catalog = "")
public class Depart {
    private int id;
    private Integer departcate;
    private String name;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "departcate")
    public Integer getDepartcate() {
        return departcate;
    }

    public void setDepartcate(Integer departcate) {
        this.departcate = departcate;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Depart depart = (Depart) o;

        if (id != depart.id) return false;
        if (departcate != null ? !departcate.equals(depart.departcate) : depart.departcate != null) return false;
        if (name != null ? !name.equals(depart.name) : depart.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (departcate != null ? departcate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
