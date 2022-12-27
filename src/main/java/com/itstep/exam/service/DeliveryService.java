package com.itstep.exam.service;

import com.itstep.exam.entity.Delivery;
import com.itstep.exam.exception.EntityNotFoundException;
import com.itstep.exam.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;

    public List<Delivery> getAll(){
        return deliveryRepository.findAll();
    }

    public Delivery get(@PathVariable Long id){
        return deliveryRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void create(@RequestBody Delivery delivery){
        deliveryRepository.save(delivery);
    }

    public Delivery update(@RequestBody Delivery newDelivery, @PathVariable Long id){
        return deliveryRepository.findById(id)
                .map(delivery ->{
                    delivery.setStatus(newDelivery.getStatus());
                    delivery.setTransporter(newDelivery.getTransporter());
                    delivery.setCargoAmount(newDelivery.getCargoAmount());
                    delivery.setCargoName(newDelivery.getCargoName());
                    delivery.setWarehouseFrom(newDelivery.getWarehouseFrom());
                    delivery.setWarehouseTo(newDelivery.getWarehouseTo());
                    return deliveryRepository.save(newDelivery);
                }).orElseGet(() ->{
                    newDelivery.setId(id);
                    return deliveryRepository.save(newDelivery);
                });
    }

    public void delete(@PathVariable Long id){
        deliveryRepository.deleteById(id);
    }
}
