package com.solvd.hospital.Models;

import java.util.Objects;

public class Office {

    private int id;
    private boolean primary;
    private int blockCode;
    private int doctorId;
    private int departmentId;

    public Office() {}

    public Office(int id, boolean primary, int blockCode, int doctorId, int departmentId) {
        this.id = id;
        this.primary = primary;
        this.blockCode = blockCode;
        this.doctorId = doctorId;
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public int getBlockCode() {
        return blockCode;
    }

    public void setBlockCode(int blockCode) {
        this.blockCode = blockCode;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", primary=" + primary +
                ", blockCode=" + blockCode +
                ", doctorId=" + doctorId +
                ", departmentId=" + departmentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Office office = (Office) o;
        return id == office.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primary, blockCode, doctorId, departmentId);
    }
}
