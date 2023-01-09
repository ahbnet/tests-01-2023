package com.microservicebootcamp.questions.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString @EqualsAndHashCode
public class Order {
    @Getter
    @Setter
    private String order;

    @Getter @Setter
    private String productId;

    @Getter @Setter
    private Date date;

    @Getter @Setter
    private Double quantity;
}
