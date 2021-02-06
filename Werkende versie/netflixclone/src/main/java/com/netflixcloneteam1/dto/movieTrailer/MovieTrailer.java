
package com.netflixcloneteam1.dto.movieTrailer;
import com.netflixcloneteam1.dto.Result;

import java.io.Serializable;
import java.util.List;

public class MovieTrailer implements Serializable
{

    private Integer id;
    private List<ResultsTrailer> results = null;
    private final static long serialVersionUID = 7439210477757914778L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ResultsTrailer> getResults() {
        return results;
    }

    public void setResults(List<ResultsTrailer> results) {
        this.results = results;
    }

}
