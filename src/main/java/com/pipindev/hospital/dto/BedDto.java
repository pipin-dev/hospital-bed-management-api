package com.pipindev.hospital.dto;

import com.pipindev.hospital.entity.Bed;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BedDto {
    private Long id;
    private String wardName;
    private String roomName;
    private String bedNumber;
    private boolean occupied;

    public static BedDto fromEntity(Bed bed) {
        return BedDto.builder()
                .id(bed.getId())
                .wardName(bed.getWardName())
                .roomName(bed.getRoomName())
                .bedNumber(bed.getBedNumber())
                .occupied(bed.isOccupied())
                .build();
    }

    public Bed toEntity() {
        return Bed.builder()
                .id(id)
                .wardName(wardName)
                .roomName(roomName)
                .bedNumber(bedNumber)
                .occupied(occupied)
                .build();
    }
}
