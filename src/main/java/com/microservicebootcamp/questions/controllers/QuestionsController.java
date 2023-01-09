package com.microservicebootcamp.questions.controllers;

import com.microservicebootcamp.questions.models.Availability;
import com.microservicebootcamp.questions.models.Order;
import com.microservicebootcamp.questions.models.Supply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class QuestionsController {
    @GetMapping("/")
    public String Hello(){
        return "running...";
    }

    @PostMapping("/updateSupply")
    public String updateSupply(@RequestBody Supply input){
        List<Supply> supplyList =new ArrayList<>();
        Supply supply1 = new Supply();
        supply1.setProductId("Product1");
        supply1.setUpdateTimeStamp(dateFormat("2021-03-16T08:53:48.616Z"));
        supply1.setQuantity(10.0);
        Supply supply2 = new Supply();
        supply2.setProductId("Product2");
        supply2.setUpdateTimeStamp(dateFormat("2021-03-16T08:59:48.616Z"));
        supply2.setQuantity(5.0);
        Supply supply3 = new Supply();
        supply3.setProductId("Product1");
        supply3.setUpdateTimeStamp(dateFormat("2021-03-16T09:10:48.616Z"));
        supply3.setQuantity(30.0);
        Supply supply4 = new Supply();
        supply4.setProductId("Product2");
        supply4.setUpdateTimeStamp(dateFormat("2021-03-16T09:10:48.616Z"));
        supply4.setQuantity(20.0);

        supplyList.add(supply1);
        supplyList.add(supply2);
        supplyList.add(supply3);
        supplyList.add(supply4);

//        Supply match
//
//        supplyList.stream().

        return "";
    };

    @PostMapping("/getProdAvailability")
    public String getProdAvailability(@RequestBody Availability input){
        return "";
    };

    @PostMapping("/getOrderStats")
    public String getOrderStats(@RequestBody Order input){
        return "";
    };

    @PostMapping("/getProdAvailability")
    public String getProdAvailability(@RequestBody Supply input){
        return "";
    };

    public static Date dateFormat(String date){
        TemporalAccessor ta = DateTimeFormatter.ISO_INSTANT.parse(date);
        Instant i = Instant.from(ta);
        Date d = Date.from(i);
        return d;
    }
}
