package com.rohan.restapis.pojo;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ItemDetails {
    private String orderItemSeqId;
    private String productId;
    private String itemDescription;
    private Float quantity;
    private Float unitAmount;

    public ItemDetails(String orderItemSeqId, String productId, String itemDescription, Float quantity, Float unitAmount) {
        this.orderItemSeqId = orderItemSeqId;
        this.productId = productId;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.unitAmount = unitAmount;
    }
}
