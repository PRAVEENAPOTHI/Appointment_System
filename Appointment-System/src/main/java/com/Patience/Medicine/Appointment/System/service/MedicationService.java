package com.Patience.Medicine.Appointment.System.service;

import com.Patience.Medicine.Appointment.System.model.Medication;
import java.util.List;
public interface MedicationService {
    void addMedication(Medication medication);
    void updateMedication(Medication medication);
    void deleteMedication(Long id);
    List<Medication> getAllMedications();
    Medication getMedicationById(Long id);


}
