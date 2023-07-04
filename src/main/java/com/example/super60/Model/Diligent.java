package com.example.super60.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Diligent extends BaseModel {
    private String name;
    private int phoneNo;
    @OneToOne
    private  Patient patient;
    @ManyToOne
    private Hospital hospital;
}
