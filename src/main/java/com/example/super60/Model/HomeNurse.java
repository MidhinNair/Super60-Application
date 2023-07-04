package com.example.super60.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class HomeNurse extends BaseModel {
    private String  name;
    private int phoneNo;
    @ManyToOne
    private Hospital hospital;
    @Enumerated(EnumType.STRING)
    private  Availability availability;
}
