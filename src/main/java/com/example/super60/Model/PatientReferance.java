package com.example.super60.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PatientReferance extends BaseModel {

    @ManyToOne
    private  Doctor doctor;
    @Enumerated(EnumType.STRING)
    private Disease disease;
    @Enumerated(EnumType.STRING)
    private TypeOfVisit TypeOfVisit;
}
