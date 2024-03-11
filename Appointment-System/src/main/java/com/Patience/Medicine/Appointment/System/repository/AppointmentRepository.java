package com.Patience.Medicine.Appointment.System.repository;

import com.Patience.Medicine.Appointment.System.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    List<Appointment> findByDoctor(String doctor);
    List<Appointment> findByDate(String date);






}
