package com.example.super60.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Medicine extends BaseModel {
    private int medicineCode;
    private  String name;
    private  float Price;
    @Enumerated(EnumType.STRING)
    private Timming timming;
    @ManyToOne
    private MedicalShop medicalShop;
}
