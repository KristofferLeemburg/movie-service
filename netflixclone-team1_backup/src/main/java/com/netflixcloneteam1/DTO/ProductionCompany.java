
package com.netflixcloneteam1.dto;

import java.io.Serializable;

public class ProductionCompany implements Serializable
{

    private Integer id;
    private String logoPath;
    private String name;
    private String originCountry;
    private final static long serialVersionUID = -623541800676042832L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

}
