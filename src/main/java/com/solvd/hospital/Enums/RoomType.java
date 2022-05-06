package com.solvd.hospital.Enums;

public enum RoomType {

    ER("emergency room"),
    HDU("high dependency unit"),
    ICU("intensive care unit"),
    MW("maternity ward"),
    PD("padded cell"),
    SR("sick room");

    private final String value;

    RoomType(String value){
        this.value = value;
    }

    public String getValue(){ return value;}
}
