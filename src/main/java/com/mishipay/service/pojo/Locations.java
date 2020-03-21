package com.mishipay.service.pojo;

import java.util.List;

public class Locations
{
    private List<Location> locations;

    public void setLocations(List<Location> locations){
        this.locations = locations;
    }
    public List<Location> getLocations(){
        return this.locations;
    }
}

