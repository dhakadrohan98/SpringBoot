package com.rohan.restapis.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="order_item")
public class OrderItem {
    @Id
    @Column(name = "order_id")
    private String orderId;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getOrderPartSeqId() {
        return orderPartSeqId;
    }

    public void setOrderPartSeqId(String orderPartSeqId) {
        this.orderPartSeqId = orderPartSeqId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Float unitAmount) {
        this.unitAmount = unitAmount;
    }

    public String getItemTypeEnumId() {
        return itemTypeEnumId;
    }

    public void setItemTypeEnumId(String itemTypeEnumId) {
        this.itemTypeEnumId = itemTypeEnumId;
    }

    public String getParentItemSeqId() {
        return parentItemSeqId;
    }

    public void setParentItemSeqId(String parentItemSeqId) {
        this.parentItemSeqId = parentItemSeqId;
    }
}
