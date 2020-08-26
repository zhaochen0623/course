package com.course.common.entity;

import java.io.Serializable;

/**
 * @ClassName Test
 * @Author ASUS
 * @Date 2020-08-26 13:50
 * @Version 1.0
 **/
public class Test implements Serializable {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
