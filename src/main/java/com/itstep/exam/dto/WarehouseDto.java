package com.itstep.exam.dto;

import com.itstep.exam.entity.Address;
import com.itstep.exam.entity.Delivery;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
public class WarehouseDto {
    private  Long id;
    private String title;
    private Address address;

    private List<Delivery> deliveriesTo;
    private List<Delivery> deliveriesFrom;

}
