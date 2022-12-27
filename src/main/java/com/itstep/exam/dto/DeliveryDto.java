package com.itstep.exam.dto;

import com.itstep.exam.entity.DeliveryStatus;
import com.itstep.exam.entity.Transporter;
import com.itstep.exam.entity.Warehouse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class DeliveryDto {
    private  Long id;
    private String cargoName;
    private int cargoAmount;
    private DeliveryStatus status;
    private Warehouse warehouseFrom;
    private Warehouse warehouseTo;
    private Transporter transporter;

}
