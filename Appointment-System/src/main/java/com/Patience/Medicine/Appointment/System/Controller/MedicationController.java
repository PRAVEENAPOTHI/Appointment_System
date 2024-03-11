// MedicationController.java
package com.Patience.Medicine.Appointment.System.Controller;

import com.Patience.Medicine.Appointment.System.model.Medication;
import com.Patience.Medicine.Appointment.System.service.MedicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationServiceImpl medicationService;

    @GetMapping("/all")
    public ResponseEntity<List<Medication>> getAllMedications() {
        List<Medication> medications = medicationService.getAllMedications();
        return ResponseEntity.ok(medications);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medication> getMedicationById(@PathVariable Long id) {
        Medication medication = medicationService.getMedicationById(id);
        return ResponseEntity.ok(medication);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMedication(@RequestBody Medication medication) {
        medicationService.addMedication(medication);
        return ResponseEntity.ok("Medication added successfully!");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateMedication(@RequestBody Medication medication) {
        medicationService.updateMedication(medication);
        return ResponseEntity.ok("Medication updated successfully!");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMedication(@PathVariable Long id) {
        medicationService.deleteMedication(id);
        return ResponseEntity.ok("Medication deleted successfully!");
    }
}
