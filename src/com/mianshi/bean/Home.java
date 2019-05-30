package com.mianshi.bean;

import java.util.List;

public class Home {
    public Home(String name) {
        this.name = name;
    }

    private String name;
    private List<House> houses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}
