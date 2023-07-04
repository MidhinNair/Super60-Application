package com.example.super60.Model;

import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Vehicle extends  BaseModel {
    private  int registerNo;
    private  String ownerName;
    private  String carModel;
    private  TypeOfVehicle typeOfVehicle;

}
