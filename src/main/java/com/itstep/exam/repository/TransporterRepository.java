package com.itstep.exam.repository;

import com.itstep.exam.entity.Transporter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransporterRepository extends JpaRepository<Transporter, Long> {
//    @Query("SELECT t FROM Transporter t WHERE :name IS null OR lower(p.name) LIKE concat('%', lower(:name), '%')")
//    Page<Transporter> findAllBy(String name, Pageable pageable);
//
//    Transporter findByName(String name);
//    List<Transporter> findAllByNameContaining(String name);
//    Page<Transporter> findAllByNameStartingWith(String name, Pageable pageable);
}
