package com.example.super60.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Bill extends BaseModel {
    int totalPrice;
}
