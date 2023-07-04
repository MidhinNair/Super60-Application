package com.example.super60.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity

public class Insurance  extends BaseModel{
    private  String companyName;
    private  int PolicyNo;
    private  String policyName;
    @ManyToOne
    private Hospital hospital;


}
