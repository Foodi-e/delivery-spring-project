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
public class Delivery{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
//    private String warehouseFrom;
//    private String warehouseTo;
    private String cargoName;
    private int cargoAmount;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @ManyToOne
    @JoinColumn(name = "warehouse_from_id")
    private Warehouse warehouseFrom;

    @ManyToOne
    @JoinColumn(name = "warehouse_to_id")
    private Warehouse warehouseTo;

    @ManyToOne
    @JoinColumn(name = "transporter_id")
    private Transporter transporter;

//    @ManyToMany
//    @JoinTable(name = "warehouse_delivery",
//            joinColumns = @JoinColumn(name = "warehouse_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "delivery_id", referencedColumnName = "id"))
//    private List<Warehouse> warehouses;



}
