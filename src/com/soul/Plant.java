package com.soul;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plant {

    private String name;
    private String male;
    private String type;
    private int day;
    private List<String> status = new ArrayList<>();
    private Ground ground;
    private List<Date> dates;

    public Plant(String name, String male, String type, int day) {
        this.name = name;
        this.male = male;
        this.type = type;
        this.day = day;
        System.out.println("Растение " + name + " создано.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Имя: "+name + "\nЦветение: "+type + "\nПол: "+male+"\nВозраст: "+day+" дней.";
    }

    public String getType() {
        return type;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setType(String type) {
        this.type = type;
    }


    public boolean hasGround(){
        return ground!=null;
    }
}
