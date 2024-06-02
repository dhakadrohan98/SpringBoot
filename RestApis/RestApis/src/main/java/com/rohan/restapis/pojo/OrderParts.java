package com.rohan.restapis.pojo;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class OrderParts {
    private String orderPartSeqId;
    private String partName;
    private String facilityId;
    private String shipmentMethodId;
    private Float partyTotal;
    private ItemDetails[] itemDetails;

    public OrderParts(String orderPartSeqId, String partName, String facilityId, String shipmentMethodId, Float partyTotal, ItemDetails[] itemDetails) {
        this.orderPartSeqId = orderPartSeqId;
        this.partName = partName;
        this.facilityId = facilityId;
        this.shipmentMethodId = shipmentMethodId;
        this.partyTotal = partyTotal;
        this.itemDetails = itemDetails;
    }
}
