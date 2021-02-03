
package com.netflixcloneteam1.DTO;
import com.netflixcloneteam1.Result;
import java.io.Serializable;
import java.util.List;

public class MovieTrailer implements Serializable
{

    private Integer id;
    private List<Result> results = null;
    private final static long serialVersionUID = 7439210477757914778L;

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
