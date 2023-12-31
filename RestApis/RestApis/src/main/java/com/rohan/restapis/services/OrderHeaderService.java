package com.rohan.restapis.services;

import com.rohan.restapis.entities.OrderHeaderNew;

import java.util.List;

public interface OrderHeaderService {

    public OrderHeaderNew createOrder(OrderHeaderNew order);

    public List<OrderHeaderNew> getOrderList();

    public OrderHeaderNew getOrderById(String orderId);

    public OrderHeaderNew updateOrderById(String orderId, OrderHeaderNew order);

    public void deleteOrderById(String orderId);

//    public List<OrderHeaderNew> getAllOrders();
}
