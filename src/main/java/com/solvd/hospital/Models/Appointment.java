package com.solvd.hospital.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment {

    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int patientId;
    private int doctorId;
    private int nurseId;
    private int procedureId;
    private int officeId;

    public Appointment() {}

    public Appointment(int id, LocalDateTime startTime, LocalDateTime endTime, int patientId,
                       int doctorId, int nurseId, int procedureId, int officeId) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.nurseId = nurseId;
        this.procedureId = procedureId;
        this.officeId = officeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
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

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public int getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(int procedureId) {
        this.procedureId = procedureId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", nurseId=" + nurseId +
                ", procedureId=" + procedureId +
                ", officeId=" + officeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, endTime, patientId, doctorId, nurseId, procedureId, officeId);
    }
}
