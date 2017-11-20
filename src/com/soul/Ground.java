package com.soul;

public class Ground {

    private String name = "default";
    private int ppm;
    private float ph;

    public Ground(int ppm, float ph) {
        this.ppm = ppm;
        this.ph = ph;
    }

    public Ground(String name, int ppm, int ph) {
        this.name = name;
        this.ppm = ppm;
        this.ph = ph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public float getPh() {
        return ph;
    }

    public void setPh(float ph) {
        this.ph = ph;
    }
}
