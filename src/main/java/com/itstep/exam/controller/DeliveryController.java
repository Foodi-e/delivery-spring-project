package com.itstep.exam.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.itstep.exam.dto.DeliveryDto;
import com.itstep.exam.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
    private final DeliveryService deliveryService;

    @GetMapping()
    public Page<DeliveryDto> getAll(@RequestParam(required = false) String name,
                                    @PageableDefault(sort = "id", direction = Sort.Direction.ASC) @ParameterObject Pageable pageable){
        //Pageable pageable = PageRequest.of(page, size);
        return deliveryService.getAll(pageable);
    }
    @GetMapping("/{id}")
    public DeliveryDto get(@PathVariable Long id){
        return deliveryService.get(id);
    }

    @PostMapping
    public void create(@RequestBody DeliveryDto deliveryDto){
        deliveryService.create(deliveryDto);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody DeliveryDto newDeliveryDto, @PathVariable Long id){
         deliveryService.update(newDeliveryDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        deliveryService.delete(id);
    }
}
