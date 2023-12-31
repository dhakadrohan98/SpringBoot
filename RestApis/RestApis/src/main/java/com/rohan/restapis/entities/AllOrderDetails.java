package com.rohan.restapis.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
@Table(name = "all_order_details")
public class AllOrderDetails {

    @Id
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_name")
    private String orderName;
    @Column(name = "placed_date")
    private Date placedDate;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @Column(name = "grand_total")
    private Double grandTotal;

    @Column(name="completed_date")
    private Date completedDate;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "order_part_seq_id")
    private String orderPartSeqId;

    @Column(name="product_id")
    private String productId;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "quantity")
    private Float quantity;

    @Column(name = "unit_amount")
    private Float unitAmount;

    @Column(name = "item_type_enum_id")
    private String itemTypeEnumId;

    @Column(name = "parent_item_seq_id")
    private String parentItemSeqId;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "vendor_party_id")
    private String vendorPartyId;

    @Column(name = "customer_party_id")
    private String customerPartyId;

    @Column(name="party_total")
    private Float  partyTotal;

    @Column(name="facility_id")
    private String facilityId;

    @Column(name = "shipment_method_id")
    private String shipmentMethodId;

    public AllOrderDetails(String orderId, String orderName, Date placedDate, Date approvedDate, String statusId, String currencyUomId, String productStoreId, String salesChannelEnumId, Double grandTotal, Date completedDate, String orderItemSeqId, String orderPartSeqId, String productId, String itemDescription, Float quantity, Float unitAmount, String itemTypeEnumId, String parentItemSeqId, String partName, String vendorPartyId, String customerPartyId, Float partyTotal, String facilityId, String shipmentMethodId) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.placedDate = placedDate;
        this.approvedDate = approvedDate;
        this.statusId = statusId;
        this.currencyUomId = currencyUomId;
        this.productStoreId = productStoreId;
        this.salesChannelEnumId = salesChannelEnumId;
        this.grandTotal = grandTotal;
        this.completedDate = completedDate;
        this.orderItemSeqId = orderItemSeqId;
        this.orderPartSeqId = orderPartSeqId;
        this.productId = productId;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
        this.unitAmount = unitAmount;
        this.itemTypeEnumId = itemTypeEnumId;
        this.parentItemSeqId = parentItemSeqId;
        this.partName = partName;
        this.vendorPartyId = vendorPartyId;
        this.customerPartyId = customerPartyId;
        this.partyTotal = partyTotal;
        this.facilityId = facilityId;
        this.shipmentMethodId = shipmentMethodId;
    }
}
