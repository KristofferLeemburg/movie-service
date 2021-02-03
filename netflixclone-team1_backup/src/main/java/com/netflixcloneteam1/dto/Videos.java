
package com.netflixcloneteam1.dto;


import java.io.Serializable;
import java.util.List;

public class Videos implements Serializable
{
    private Integer id;
    private List<Result> results = null;
//    private final static long serialVersionUID = -7881277909456503877L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
