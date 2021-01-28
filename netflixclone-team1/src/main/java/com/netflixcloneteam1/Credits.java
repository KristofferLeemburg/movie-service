
package com.netflixcloneteam1;

import java.io.Serializable;
import java.util.List;

public class Credits implements Serializable
{
    private List<Crew> crew = null;

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }
}
