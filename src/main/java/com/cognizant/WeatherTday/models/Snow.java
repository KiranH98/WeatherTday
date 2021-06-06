package com.cognizant.WeatherTday.models;

public class Snow {
    public double snow1h;
    public double snow3h;

    public Snow() {
        super();
    }

    public Snow(double snow1h, double snow3h) {
        this.snow1h = snow1h;
        this.snow3h = snow3h;
    }

    public double getSnow1h() {
        return snow1h;
    }

    public void setSnow1h(double snow1h) {
        this.snow1h = snow1h;
    }

    public double getSnow3h() {
        return snow3h;
    }

    public void setSnow3h(double snow3h) {
        this.snow3h = snow3h;
    }
}
