package com.solvd.hospital.Enums;

public enum Gender{

    M("male"),
    F("female");

    private final String value;

    Gender(String value){
        this.value = value;
    }

    public String getValue(){ return value;}
}
