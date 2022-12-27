package com.itstep.exam.dto;

import com.itstep.exam.entity.Delivery;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class TransporterDto {
    private  Long id;
    private String name;
    private String carModel;
    private int loadCapacity;

    private List<Delivery> deliveries;
}
