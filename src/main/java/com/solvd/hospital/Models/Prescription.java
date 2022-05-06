package com.solvd.hospital.Models;

import java.util.Objects;

public class Prescription {

    private int id;
    private String dose;
    private String description;
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private int medicationId;

    public Prescription() {}

    public Prescription(int id, String dose, String description, int appointmentId, int patientId,
                        int doctorId, int medicationId) {
        this.id = id;
        this.dose = dose;
        this.description = description;
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medicationId = medicationId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", dose='" + dose + '\'' +
                ", description='" + description + '\'' +
                ", appointmentId=" + appointmentId +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", medicationId=" + medicationId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dose, description, appointmentId, patientId, doctorId, medicationId);
    }
}
