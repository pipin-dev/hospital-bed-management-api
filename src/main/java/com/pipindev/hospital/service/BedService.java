package com.pipindev.hospital.service;

import com.pipindev.hospital.dto.BedDto;
import com.pipindev.hospital.entity.Bed;
import com.pipindev.hospital.repository.BedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BedService {

    private final BedRepository bedRepository;

    public List<BedDto> getAllBeds() {
        return bedRepository.findAll().stream()
                .map(BedDto::fromEntity)
                .collect(Collectors.toList());
    }

    public List<BedDto> getBedsByWard(String wardName) {
        return bedRepository.findByWardName(wardName).stream()
                .map(BedDto::fromEntity)
                .collect(Collectors.toList());
    }

    public BedDto addBed(BedDto dto) {
        Bed bed = bedRepository.save(dto.toEntity());
        return BedDto.fromEntity(bed);
    }
}
