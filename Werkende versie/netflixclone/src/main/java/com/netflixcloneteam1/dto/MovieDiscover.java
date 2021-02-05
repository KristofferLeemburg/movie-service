
package com.netflixcloneteam1.dto;
import java.util.List;

public class MovieDiscover {

    private Integer page;
    private List<Result> results = null;
    private Integer totalPages;
    private Integer totalResults;
    private Credits credits;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Credits getCredits() {return credits; }

    public void setCredits (Credits credits) {this.credits = credits; }
}
