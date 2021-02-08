
package com.netflixcloneteam1.dto;

import java.io.Serializable;

public class Crew implements Serializable
{
    private String name;
    private String job;
    private Boolean adult;
    private Integer gender;
    private Integer id;
    private String knownForDepartment;
    private String originalName;
    private Float popularity;
    private Object profilePath;
    private String creditId;
    private String department;
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
