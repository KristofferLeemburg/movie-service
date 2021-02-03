
package com.netflixcloneteam1.dto;

import java.io.Serializable;
import java.util.List;

public class Credits implements Serializable
{

//    private List<Cast> cast = null;
    private List<Crew> crew = null;
//    private final static long serialVersionUID = 1040128773354111160L;

//    public List<Cast> getCast() {
//        return cast;
//    }
//
//    public void setCast(List<Cast> cast) {
//        this.cast = cast;
//    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

}
