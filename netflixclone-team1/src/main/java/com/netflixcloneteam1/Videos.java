
package com.netflixcloneteam1;

import java.io.Serializable;
import java.util.List;

public class Videos implements Serializable
{
    private List<Result> results = null;
    private final static long serialVersionUID = -7881277909456503877L;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
