package com.solvd.hospital.Models;

import com.solvd.hospital.Enums.Gender;

import java.sql.Date;
import java.util.Objects;

public class Patient extends Human {

    private String address;
    private String phoneNumber;

    public Patient() {}

    public Patient(int id, String firstName, String lastName, Gender gender,
                   Date birthDate, String address, String phoneNumber) {
        super(id, firstName, lastName, gender, birthDate);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                super.toString() +
                "address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return this.getId() == patient.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getFullName(), this.getBirthDate(), address, phoneNumber);
    }

}
