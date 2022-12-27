package com.itstep.exam.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Location {
    private String latitude;
    private String longitude;
}
