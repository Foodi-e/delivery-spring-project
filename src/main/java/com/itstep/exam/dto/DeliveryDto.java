package com.itstep.exam.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.itstep.exam.entity.DeliveryStatus;
import com.itstep.exam.entity.Transporter;
import com.itstep.exam.entity.Warehouse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryDto {
    private  Long id;
    private String cargoName;
    private int cargoAmount;
    private DeliveryStatus status;
    private Warehouse warehouseFrom;
    private Warehouse warehouseTo;
    private Transporter transporter;

}
