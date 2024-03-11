// AppointmentDTO.java
package com.Patience.Medicine.Appointment.System.dto;

public class AppointmentDTO {

    private String slot;
    private String doctor;
    private String date;

    // getters and setters


    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
