package com.Patience.Medicine.Appointment.System.service;

import com.Patience.Medicine.Appointment.System.model.Appointment;
import com.Patience.Medicine.Appointment.System.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public void bookAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public void updateAppointment(Appointment appointment) {
        // Implement logic to update appointment
        appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        // Implement logic to delete appointment
        appointmentRepository.deleteById(id);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }
}
