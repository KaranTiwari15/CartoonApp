package com.cartoon.demo.model;

public class Cartoon {

    private int carId;
    private String carName;
    private  String hero;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public Cartoon(int carId, String carName, String hero) {
        this.carId = carId;
        this.carName = carName;
        this.hero = hero;
    }

    public Cartoon() {
    }

    @Override
    public String toString() {
        return "Cartoon{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", hero='" + hero + '\'' +
                '}';
    }
}
