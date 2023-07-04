package com.example.super60.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PatientTravel extends BaseModel {
    @Enumerated(EnumType.STRING)
    private  PickupDrop pickupDrop;
    @Enumerated(EnumType.STRING)
    private TypeOfVisit typeOfVisit;
    @ManyToOne
    private  Driver driver;

}
