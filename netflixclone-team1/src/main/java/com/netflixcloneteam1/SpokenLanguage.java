
package com.netflixcloneteam1;

import java.io.Serializable;

public class SpokenLanguage implements Serializable
{

    private String englishName;
    private String iso6391;
    private String name;
    private final static long serialVersionUID = -7353422886940094934L;

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
