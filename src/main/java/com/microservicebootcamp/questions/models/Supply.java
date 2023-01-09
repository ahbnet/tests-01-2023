package com.microservicebootcamp.questions.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString @EqualsAndHashCode
public class Supply {
    @Getter @Setter
    private String productId;
    @Getter @Setter
    private Date updateTimeStamp;
    @Getter @Setter
    private Double quantity;
    @Getter @Setter
    private String status;
}
