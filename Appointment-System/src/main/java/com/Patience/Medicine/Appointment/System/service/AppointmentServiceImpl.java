package com.Patience.Medicine.Appointment.System.service;

import com.Patience.Medicine.Appointment.System.model.Appointment;
import com.Patience.Medicine.Appointment.System.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl extends AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void bookAppointment(Appointment appointment) {
        // Implementation for booking an appointment
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        // Implementation for updating an appointment
    }

    @Override
    public void deleteAppointment(Long id) {
        // Implementation for deleting an appointment
    }

    @Override
    public List<Appointment> getAllAppointments() {
        // Implementation for retrieving all appointments
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        // Implementation for retrieving an appointment by ID
        return appointmentRepository.findById(id).orElse(null);
    }
}
