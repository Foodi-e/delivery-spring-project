package com.itstep.exam.dto;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
public class LocationDto {
    private String latitude;
    private String longitude;
}
