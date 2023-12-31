package com.rohan.restapis.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "order_part")
public class OrderPart {
    @Id
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_part_seq_id")
    private String orderPartSeqId;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "status_id")
    private String statusId;

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



}
