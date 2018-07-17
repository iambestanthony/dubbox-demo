package com.jay.domain;

import java.io.Serializable;

/**
 * Created by JayJ on 2018/7/15.
 **/
public class User implements Serializable{
    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ""+id;
    }
}
