
package com.netflixcloneteam1.dto;

import java.io.Serializable;
import java.util.List;

public class Credits implements Serializable
{
    private List<Crew> crew = null;
//    private List<Cast> cast = null;
//    private final static long serialVersionUID = 1040128773354111160L;

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }
}
