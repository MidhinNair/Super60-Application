package com.example.super60.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Driver extends BaseModel {
    private  String name;
    private  int phoneNo;
    @ManyToOne
    private Hospital hospital;

    @OneToOne
    private Vehicle vehicle;
    @Enumerated(EnumType.STRING)
    private  Availability availability;

}
