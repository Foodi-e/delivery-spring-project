package com.itstep.exam.controller;

import com.itstep.exam.entity.Delivery;
import com.itstep.exam.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    private final DeliveryService deliveryService;

    @GetMapping()
    public List<Delivery> getAll(){
        return deliveryService.getAll();
    }
    @GetMapping("/{id}")
    public Delivery get(@PathVariable Long id){
        return deliveryService.get(id);
    }

    @PostMapping
    public void create(@RequestBody Delivery delivery){
        deliveryService.create(delivery);
    }

    @PutMapping("/{id}")
    public Delivery update(@RequestBody Delivery newDelivery, @PathVariable Long id){
        return deliveryService.update(newDelivery, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        deliveryService.delete(id);
    }
}
