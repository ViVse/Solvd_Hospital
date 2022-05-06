package com.solvd.hospital.Models;

import com.solvd.hospital.Enums.Gender;

import java.sql.Date;
import java.util.Objects;

public class Doctor extends Human {

    private int experience;
    private Position position;
    private Phone phoneNumber;

    public Doctor() {}

    public Doctor(int id, String firstName, String lastName, Gender gender, Date birthDate,
                  int experience, Position position, Phone phoneNumber) {
        super(id, firstName, lastName, gender, birthDate);
        this.experience = experience;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Phone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString() +
                "experience=" + experience +
                ", " + position.toString() +
                ", " + phoneNumber.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return this.getId() == doctor.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getFullName(), this.getBirthDate(), experience, position, phoneNumber);
    }

}
