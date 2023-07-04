package com.example.super60.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class MedicalShop extends BaseModel {
    private  int phoneNo;
    private String name;
    private  String ownerName;
    @OneToMany(mappedBy = "medicalShop") //bidirectional relationships with Medicine and Patient.
    private List<Medicine> medicineList;
    @ManyToMany
    private List<Patient> patientList;
}
