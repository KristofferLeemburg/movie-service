
package com.netflixcloneteam1.model;

import java.io.Serializable;

public class Crew implements Serializable
{
    private String name;
    private String job;
    private final static long serialVersionUID = 7882275310212852573L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
