package com.itstep.exam.repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.itstep.exam.entity.Delivery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    Page<Delivery> findAllBy(String cargoName, Pageable pageable);
}
