package com.wlj.model;

public class Trains {

    private  Integer id;
    private  String trainsId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainsId() {
        return trainsId;
    }

    public void setTrainsId(String trainsId) {
        this.trainsId = trainsId;
    }

    @Override
    public String toString() {
        return "Trains{" +
                "id=" + id +
                ", trainsId='" + trainsId + '\'' +
                '}';
    }
}
