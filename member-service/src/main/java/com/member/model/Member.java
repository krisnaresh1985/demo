package com.member.model;

public class Member {

    private int id;
    private String name;
    private int years;

    public Member(int id, String name, int years) {
        this.id = id;
        this.name = name;
        this.years = years;
    }

    public Member(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
