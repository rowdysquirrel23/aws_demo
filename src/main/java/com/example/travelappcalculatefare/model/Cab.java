package com.example.travelappcalculatefare.model;

public class Cab {
	private int cabid;
    private String name;
    private double distance;
    private double fare; 

    public Cab() {}

    public Cab(int cabid, String name, double distance) {
        this.cabid = cabid;
        this.name = name;
        this.distance = distance;
        this.fare = distance * 2; 
    }

    public int getCabid() {
        return cabid;
    }

    public void setCabid(int cabid) {
        this.cabid = cabid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Cab [cabid=" + cabid + ", name=" + name + ", distance=" + distance + ", fare=" + fare + "]";
    }
}
