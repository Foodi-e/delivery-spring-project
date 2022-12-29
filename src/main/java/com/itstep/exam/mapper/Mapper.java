package com.itstep.exam.mapper;

import com.itstep.exam.dto.DeliveryDto;
import com.itstep.exam.dto.TransporterDto;
import com.itstep.exam.dto.WarehouseDto;
import com.itstep.exam.entity.Delivery;
import com.itstep.exam.entity.Transporter;
import com.itstep.exam.entity.Warehouse;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    WarehouseDto toDto(Warehouse warehouse);
    Warehouse toEntity(WarehouseDto dto);
    void merge(WarehouseDto warehouseDto, @MappingTarget Warehouse warehouse);

    DeliveryDto toDto(Delivery delivery);
    Delivery toEntity(DeliveryDto dto);
    void merge(DeliveryDto dto, @MappingTarget Delivery delivery);

    TransporterDto toDto(Transporter transporter);
    Transporter toEntity(TransporterDto dto);
    void merge(TransporterDto dto, @MappingTarget Transporter transporter);
}
