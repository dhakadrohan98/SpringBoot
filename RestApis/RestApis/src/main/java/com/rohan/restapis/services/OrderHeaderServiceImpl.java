package com.rohan.restapis.services;

import com.rohan.restapis.entities.AllOrderDetails;
import com.rohan.restapis.entities.OrderHeaderNew;
import com.rohan.restapis.repositories.OrderHeaderNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHeaderServiceImpl implements OrderHeaderService {

    @Autowired
    private OrderHeaderNewRepository orderHeaderRepository;

    @Override
    public OrderHeaderNew createOrder(OrderHeaderNew order) {
        try {
            System.out.println(order);
            return this.orderHeaderRepository.save(order);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception from OrderHeaderServiceImpl: "+ e.getMessage());
            return null;
        }
    }

    @Override
    public List<OrderHeaderNew> getOrderList() {
        return this.orderHeaderRepository.findAll();
    }

    @Override
    public OrderHeaderNew getOrderById(String orderId) {
        return this.orderHeaderRepository.findById(orderId).get();
    }

    @Override
    public OrderHeaderNew updateOrderById(String orderId, OrderHeaderNew order) {
        OrderHeaderNew presentOrder = this.orderHeaderRepository.findById(orderId).get();
        presentOrder.setOrderId(order.getOrderId());
        presentOrder.setOrderName(order.getOrderName());
        presentOrder.setPlacedDate(order.getPlacedDate());
        presentOrder.setApprovedDate(order.getApprovedDate());
        presentOrder.setStatusId(order.getStatusId());
        presentOrder.setCurrencyUomId(order.getCurrencyUomId());
        presentOrder.setProductStoreId(order.getProductStoreId());
        presentOrder.setSalesChannelEnumId(order.getSalesChannelEnumId());
        presentOrder.setGrandTotal(order.getGrandTotal());
        presentOrder.setCompletedDate(order.getCompletedDate());
        return this.orderHeaderRepository.save(presentOrder);
    }

    @Override
    public void deleteOrderById(String orderId) {
        this.orderHeaderRepository.deleteById(orderId);
    }

//    @Override
//    public List<AllOrderDetails> getAllOrders() {
//        return this.orderHeaderRepository.findOrdersWithItemsAndParts();
//    }
}
