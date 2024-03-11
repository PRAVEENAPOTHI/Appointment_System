package com.Patience.Medicine.Appointment.System.repository;

import com.Patience.Medicine.Appointment.System.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicationRepository extends JpaRepository<Medication,Long> {
    List<Medication> findByName(String name);
    List<Medication> findByDosage(String dosage);



}
