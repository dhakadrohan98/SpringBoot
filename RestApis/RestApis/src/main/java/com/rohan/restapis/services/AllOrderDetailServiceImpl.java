package com.rohan.restapis.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rohan.restapis.entities.AllOrderDetails;
import com.rohan.restapis.repositories.AllOrderDetailsRepository;
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
    public AllOrderDetails getAllOrders() {
        String tempStr = this.orderHeaderNewRepository.findOrdersWithItemsAndParts();
        System.out.println(tempStr);
        try {
             String[] strArr = tempStr.split(",");
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse("1998-11-08");
            Date date2=new SimpleDateFormat("yyyy-MM-dd").parse("1998-11-08");
            Date date3=new SimpleDateFormat("yyyy-MM-dd").parse("1998-11-08");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date11 = outputFormat.format(date1);
            Date parsedDate1 = outputFormat.parse(date11);

            Double gt = 199.9;
            Float q= 19.7f;
            Float uA = 98.8f;
            Float pL = 65.8f;

//       List<AllOrderDetails> allOrder = new ArrayList<>();
            AllOrderDetails allOrderDetails = new AllOrderDetails(strArr[0],strArr[1], parsedDate1, parsedDate1,strArr[4],
                    strArr[5],strArr[6],strArr[7],gt, parsedDate1, strArr[10], strArr[11], strArr[12], strArr[13],
                    q, uA, strArr[16], strArr[17], strArr[18], strArr[19], strArr[20], pL, strArr[22],
                    strArr[23]);


        return allOrderDetails;
    } catch (Exception e) {
           e.printStackTrace();
            return null;
        }
    }
}

//        String[] strArr = tempStr.split(",");
//       List<AllOrderDetails> allOrder = new ArrayList<>();
//       AllOrderDetails allOrderDetails = new AllOrderDetails(strArr[0],strArr[1], strArr[2], strArr[3],strArr[4]);
