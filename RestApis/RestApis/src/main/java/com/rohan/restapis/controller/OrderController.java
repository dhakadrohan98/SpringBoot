package com.rohan.restapis.controller;

import com.rohan.restapis.entities.AllOrderDetails;
import com.rohan.restapis.entities.OrderHeaderNew;
import com.rohan.restapis.entities.Person;
import com.rohan.restapis.services.AllOrderDetailsService;
import com.rohan.restapis.services.OrderHeaderService;
import com.rohan.restapis.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private PersonService personService;
    @Autowired
    private OrderHeaderService orderHeaderService;

    @Autowired
    private AllOrderDetailsService allOrderDetailsService;
    @PostMapping("/create/person")
    public Person createPerson(@RequestBody Person person) {
        return this.personService.createPerson(person);
    }

    @GetMapping("/order/{id}")
    public OrderHeaderNew getOrderById(@PathVariable("id") String orderId) {
        return this.orderHeaderService.getOrderById(orderId);
    }

    @PostMapping("/create/order")
    public OrderHeaderNew createOrder(@RequestBody OrderHeaderNew order) {
        return this.orderHeaderService.createOrder(order);
    }

    @GetMapping("get/allorder")
    public AllOrderDetails getAllOrders() {
        return this.allOrderDetailsService.getAllOrders();
    }
}
