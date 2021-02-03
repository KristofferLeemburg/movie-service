
package com.netflixcloneteam1.dto;

import java.io.Serializable;

public class Genre implements Serializable
{

    private Integer id;
    private String name;
    private final static long serialVersionUID = 3375529569450378574L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
