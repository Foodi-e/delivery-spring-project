package com.itstep.exam.service;

import com.itstep.exam.dto.TransporterDto;
import com.itstep.exam.entity.Transporter;
import com.itstep.exam.exception.EntityNotFoundException;
import com.itstep.exam.mapper.Mapper;
import com.itstep.exam.repository.TransporterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TransporterService {
    private final TransporterRepository transporterRepository;
    private final Mapper mapper;

    public Page<TransporterDto> getAll(String name, Pageable pageable) {
        return transporterRepository.findAllBy(name, pageable).map(mapper::toDto);
    }

    public TransporterDto get(Long id) {
        return transporterRepository.findById(id).map(mapper::toDto).orElseThrow(EntityNotFoundException::new);
    }

    public void create(TransporterDto transporterDto) {
        transporterRepository.save(mapper.toEntity(transporterDto));
    }

    public void update(Long id, TransporterDto transporterDto) {
        Transporter transporter = transporterRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        mapper.merge(transporterDto, transporter);
        transporterRepository.save(transporter);
    }

    public void delete(Long id) {
        transporterRepository.deleteById(id);
    }
}
