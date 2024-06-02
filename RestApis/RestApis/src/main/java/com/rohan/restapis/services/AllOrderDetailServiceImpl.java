package com.rohan.restapis.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rohan.restapis.entities.AllOrderDetails;
import com.rohan.restapis.pojo.*;
import com.rohan.restapis.repositories.OrderHeaderNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class AllOrderDetailServiceImpl implements AllOrderDetailsService {

    @Autowired
    private OrderHeaderNewRepository orderHeaderNewRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public CustomObject getAllOrders() {
        String orderDetailsStr = this.orderHeaderNewRepository.findOrdersWithItemsAndParts();
        System.out.println(orderDetailsStr);

        try {
            //converting orderDetailsStr string into string[] array: strArr.
            String[] strArr = orderDetailsStr.split(",");
            String customerPartyId = strArr[20];
            //finding person details from person table
            String personDetails = this.orderHeaderNewRepository.findPerson(customerPartyId);
            //converting personDetails string into string[] array: personStrArr.
            String[] personStrArr = personDetails.split(",");

            System.out.println("Person details: "+ personDetails);
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse("1998-11-08");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date11 = outputFormat.format(date1);

            Double gT = 199.9;
            Float qT= 19.7f;
            Float uA = 98.8f;
            Float pL = 65.8f;

            String orderId = strArr[0];
            String orderName = strArr[1];
            Date placedDate = outputFormat.parse(date11);
            Date approvedDate = outputFormat.parse(date11);
            String statusId = strArr[4];
            String currencyUomId = strArr[5];
            String productStoreId = strArr[6];
            String salesChannelEnumId = strArr[7];
            Double grandTotal = gT;
            Date completedDate = outputFormat.parse(date11);
            String orderItemSeqId = strArr[10];
            String orderPartSeqId = strArr[11];
            String productId =  strArr[12];
            String itemDescription = strArr[13];
            Float quantity =  qT;
            Float unitAmount = uA;
            String itemTypeEnumId =  strArr[16];
            String parentItemSeqId = strArr[17];
            String partName = strArr[18];
            String vendorPartyId = strArr[19];
            customerPartyId = strArr[20];
            Float  partyTotal = pL;
            String facilityId = strArr[22];
            String shipmentMethodId = strArr[23];

            //Hardcoded values;
            String firstName = personStrArr[0];
            String middleName = "";
            String lastName = personStrArr[1];

            //Making required response;
            //ItemDetails class's object;
            //creating an itemDetails array of size 5;
            ItemDetails[] itemDetails = new ItemDetails[1];
            itemDetails[0] = new ItemDetails(orderItemSeqId,productId,itemDescription, quantity, unitAmount);
            //OrderParts class's object;
            OrderParts[] orderParts = new OrderParts[1];
            orderParts[0] = new OrderParts(orderPartSeqId, partName, facilityId, shipmentMethodId, partyTotal, itemDetails);
            //CustomerDetails class's object;
            CustomerDetails customerDetails = new CustomerDetails(customerPartyId, firstName, middleName, lastName);
            //Orders class's object
            Orders[] orders = new Orders[1];
            orders[0] = new Orders(orderId, orderName, currencyUomId, salesChannelEnumId, statusId, placedDate, grandTotal, customerDetails, orderParts);

            CustomObject customObject = new CustomObject(orders);


            //       List<AllOrderDetails> allOrder = new ArrayList<>();
            AllOrderDetails allOrderDetails = new AllOrderDetails(strArr[0],strArr[1], placedDate, approvedDate,strArr[4],
                    strArr[5],strArr[6],strArr[7],grandTotal, completedDate, strArr[10], strArr[11], strArr[12], strArr[13],
                    quantity, unitAmount, strArr[16], strArr[17], strArr[18], strArr[19], strArr[20], partyTotal, strArr[22],
                    strArr[23]);

            return customObject;
    } catch (Exception e) {
            System.out.println("Excpetion occurred: ");
           e.printStackTrace();
            return null;
        }
    }
}

//        String[] strArr = tempStr.split(",");
//       List<AllOrderDetails> allOrder = new ArrayList<>();
//       AllOrderDetails allOrderDetails = new AllOrderDetails(strArr[0],strArr[1], strArr[2], strArr[3],strArr[4]);
