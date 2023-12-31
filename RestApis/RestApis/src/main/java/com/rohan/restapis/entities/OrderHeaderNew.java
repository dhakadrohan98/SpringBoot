package com.rohan.restapis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "order_header_new")
public class OrderHeaderNew {
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Date getPlacedDate() {
        return placedDate;
    }

    public void setPlacedDate(Date placedDate) {
        this.placedDate = placedDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    @Override
    public String toString() {
        return "OrderHeader{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", placedDate=" + placedDate +
                ", approvedDate=" + approvedDate +
                ", statusId='" + statusId + '\'' +
                ", currencyUomId='" + currencyUomId + '\'' +
                ", productStoreId='" + productStoreId + '\'' +
                ", salesChannelEnumId='" + salesChannelEnumId + '\'' +
                ", grandTotal=" + grandTotal +
                ", completedDate=" + completedDate +
                '}';
    }
}










