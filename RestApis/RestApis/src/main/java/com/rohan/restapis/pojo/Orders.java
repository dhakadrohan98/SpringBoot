package com.rohan.restapis.pojo;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Orders {

    private String orderId;
    private String orderName;
    private String currencyUomId;
    private String salesChannelEnumId;
    private String statusId;
    private Date placedDate;
    private Double grandTotal;
    private CustomerDetails customerDetails;
    private OrderParts[] orderParts;

    public Orders(String orderId, String orderName, String currencyUomId, String salesChannelEnumId, String statusId, Date placedDate, Double grandTotal, CustomerDetails customerDetails, OrderParts[] orderParts) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.currencyUomId = currencyUomId;
        this.salesChannelEnumId = salesChannelEnumId;
        this.statusId = statusId;
        this.placedDate = placedDate;
        this.grandTotal = grandTotal;
        this.customerDetails = customerDetails;
        this.orderParts = orderParts;
    }
}
