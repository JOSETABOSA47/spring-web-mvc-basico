package com.globallabs.SPRINGwebmvc.model;


import org.springframework.lang.NonNull;

public class Jedi {
    @NonNull
    private String name;
    @NonNull
    private String lastName;

    public Jedi (final String name, final String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi () {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
