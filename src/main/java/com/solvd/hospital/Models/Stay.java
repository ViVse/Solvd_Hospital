package com.solvd.hospital.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Stay {

    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int patientId;
    private int roomId;

    public Stay() {}

    public Stay(int id, LocalDateTime startTime, LocalDateTime endTime, int patientId, int roomId) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.patientId = patientId;
        this.roomId = roomId;
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

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Stay{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", patientId=" + patientId +
                ", roomId=" + roomId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stay stay = (Stay) o;
        return id == stay.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, endTime, patientId, roomId);
    }
}
