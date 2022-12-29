package com.itstep.exam.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.itstep.exam.dto.DeliveryDto;
import com.itstep.exam.entity.Delivery;
import com.itstep.exam.exception.EntityNotFoundException;
import com.itstep.exam.mapper.Mapper;
import com.itstep.exam.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Service

public class DeliveryService {
    private final DeliveryRepository deliveryRepository;
    private final Mapper mapper;

    public Page<DeliveryDto> getAll(Pageable pageable) {
        Page<Delivery> deliveries = deliveryRepository.findAll(pageable);
        return deliveries.map(mapper::toDto);

    }

    public DeliveryDto get(@PathVariable Long id){
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
        return mapper.toDto(delivery);
    }

    public void create(@RequestBody DeliveryDto deliveryDto){
        Delivery delivery = mapper.toEntity(deliveryDto);
        deliveryRepository.save(delivery);
    }

    public void update(@RequestBody DeliveryDto newDeliveryDto, @PathVariable Long id) {
        Delivery delivery = deliveryRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        mapper.merge(newDeliveryDto, delivery);
        deliveryRepository.save(delivery);
//        Delivery newDelivery = mapper.toEntity(newDeliveryDto);
//        Delivery updatedDelivery = deliveryRepository.findById(id)
//                .map(delivery -> {
//                    delivery.setStatus(newDelivery.getStatus());
//                    delivery.setTransporter(newDelivery.getTransporter());
//                    delivery.setCargoAmount(newDelivery.getCargoAmount());
//                    delivery.setCargoName(newDelivery.getCargoName());
//                    delivery.setWarehouseFrom(newDelivery.getWarehouseFrom());
//                    delivery.setWarehouseTo(newDelivery.getWarehouseTo());
//                    return deliveryRepository.save(delivery);
//                }).orElseThrow(() -> new EntityNotFoundException(id));
//        return mapper.toDto(updatedDelivery);

    }

    public void delete(@PathVariable Long id){
        deliveryRepository.deleteById(id);
    }
}
