package com.example.super60.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Doctor extends BaseModel {
    private String name;
    private  int phoneNo;
    @Enumerated(EnumType.STRING)
    private Department doctorSpecialization;
    @ManyToOne
    private Hospital hospital;

}
