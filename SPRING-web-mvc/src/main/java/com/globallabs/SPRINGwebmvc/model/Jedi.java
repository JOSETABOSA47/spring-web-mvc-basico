package com.globallabs.SPRINGwebmvc.model;

public class Jedi {

    private String name;
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
