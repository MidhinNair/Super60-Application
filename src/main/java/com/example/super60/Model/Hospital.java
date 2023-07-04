package com.example.super60.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class Hospital extends BaseModel {
    private int phoneNo;
    private String name;
    private String location;
             //bidirectional relationships with Doctor, Patient, Driver, and Insurance
    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctorList;
    @OneToMany(mappedBy = "hospital")
    private List<Patient> patientList;
    @OneToMany(mappedBy = "hospital")

    private  List<Driver> driverList;

    @OneToMany(mappedBy = "hospital")
    private  List<Insurance> insuranceList;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Department> departmentList;
    @ManyToMany
    private List<MedicalShop> medicalShopList;
}
