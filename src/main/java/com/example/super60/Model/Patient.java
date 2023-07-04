package com.example.super60.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Patient extends BaseModel{
    private String name;
    @OneToOne(mappedBy = "patient")
    private Diligent diligent;
    @ManyToOne
    private Hospital hospital;
    @Enumerated(EnumType.STRING)
    private HomeAssist homeAssist;
    @Enumerated(EnumType.STRING)
    private NeedInsurance needInsurance;
    @Enumerated(EnumType.STRING)
    private NetworkMode networkMode;
}
