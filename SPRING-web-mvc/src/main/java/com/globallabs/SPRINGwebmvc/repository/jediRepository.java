package com.globallabs.SPRINGwebmvc.repository;

import com.globallabs.SPRINGwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class jediRepository {
    private List<Jedi> jedi;

    public jediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywlker"));
    }

    public List<Jedi> getAllJedi(){

        return this.jedi;
    }

    public void add(final Jedi jedi) {
        this.jedi.add(jedi);
    }
}

