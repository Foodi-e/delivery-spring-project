package com.itstep.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String title;

    @Embedded
    private Address address;

//    @ManyToMany(mappedBy = "warehouses")
//    private List<Delivery> deliveries;

    @OneToMany(mappedBy = "warehouseTo")
    private List<Delivery> deliveriesTo;

    @OneToMany(mappedBy = "warehouseFrom")
    private List<Delivery> deliveriesFrom;

}
