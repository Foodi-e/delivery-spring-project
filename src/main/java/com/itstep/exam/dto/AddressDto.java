package com.itstep.exam.dto;

import com.itstep.exam.entity.Location;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
public class AddressDto {
    private String city;
    private String street;

    private Location location;
}
