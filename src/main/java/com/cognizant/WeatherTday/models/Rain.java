package com.cognizant.WeatherTday.models;

public class Rain {
    public double rain1h;
    public double rain3h;

    public Rain() {
        super();
    }

    public Rain(double rain1h, double rain3h) {
        this.rain1h = rain1h;
        this.rain3h = rain3h;
    }

    public double getRain1h() {
        return rain1h;
    }

    public void setRain1h(double rain1h) {
        this.rain1h = rain1h;
    }

    public double getRain3h() {
        return rain3h;
    }

    public void setRain3h(double rain3h) {
        this.rain3h = rain3h;
    }
}
