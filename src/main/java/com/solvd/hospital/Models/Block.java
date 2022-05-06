package com.solvd.hospital.Models;

import java.util.Objects;

public class Block {

    private int code;
    private int floor;

    public Block() {}

    public Block(int code, int floor) {
        this.code = code;
        this.floor = floor;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Block{" +
                "code=" + code +
                ", floor=" + floor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return code == block.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, floor);
    }

}
