package com.pipindev.hospital.controller;

import com.pipindev.hospital.dto.BedDto;
import com.pipindev.hospital.service.BedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beds")
@RequiredArgsConstructor
public class BedController {

    private final BedService bedService;

    @GetMapping
    public ResponseEntity<List<BedDto>> getAllBeds() {
        return ResponseEntity.ok(bedService.getAllBeds());
    }

    @GetMapping("/ward/{wardName}")
    public ResponseEntity<List<BedDto>> getBedsByWard(@PathVariable String wardName) {
        return ResponseEntity.ok(bedService.getBedsByWard(wardName));
    }

    @PostMapping
    public ResponseEntity<BedDto> addBed(@RequestBody BedDto dto) {
        return ResponseEntity.ok(bedService.addBed(dto));
    }
}
