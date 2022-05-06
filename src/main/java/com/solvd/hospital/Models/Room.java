package com.solvd.hospital.Models;

import com.solvd.hospital.Enums.RoomType;

import java.util.Objects;

public class Room {

    private int id;
    private RoomType type;
    private boolean available;
    private int blockCode;

    public Room() {}

    public Room(int id, RoomType type, boolean available, int blockCode) {
        this.id = id;
        this.type = type;
        this.available = available;
        this.blockCode = blockCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(int blockCode) {
        this.blockCode = blockCode;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", type=" + type +
                ", available=" + available +
                ", blockCode=" + blockCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id && blockCode == room.blockCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, available, blockCode);
    }
}
