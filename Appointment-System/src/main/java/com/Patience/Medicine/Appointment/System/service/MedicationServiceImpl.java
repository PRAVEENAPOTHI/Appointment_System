package com.Patience.Medicine.Appointment.System.service;

import com.Patience.Medicine.Appointment.System.model.Medication;
import com.Patience.Medicine.Appointment.System.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationServiceImpl {
    @Autowired
    private MedicationRepository medicationRepository;



    public void addMedication(Medication medication){
        medicationRepository.save(medication);

    }


    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    public Medication getMedicationById(Long id) {
        return medicationRepository.findById(id).orElse(null);

    }

    public void updateMedication(Medication medication) {
        medicationRepository.save(medication);
    }

    public void deleteMedication(Long id) {
        medicationRepository.deleteById(id);
    }
}

