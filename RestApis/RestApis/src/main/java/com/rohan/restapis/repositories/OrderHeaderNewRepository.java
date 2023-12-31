package com.rohan.restapis.repositories;

import com.rohan.restapis.entities.AllOrderDetails;
import com.rohan.restapis.entities.OrderHeaderNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderHeaderNewRepository extends JpaRepository <OrderHeaderNew,String> {

    @Query(value = "SELECT order_header_new.*, oi.order_item_seq_id, oi.order_part_seq_id, oi.product_id, oi.item_description, oi.quantity, oi.unit_amount, oi.item_type_enum_id, oi.parent_item_seq_id,\n" +
            "op.part_name,op.vendor_party_id, op.customer_party_id, op.party_total, op.facility_id, op.shipment_method_id FROM order_header_new INNER JOIN order_item oi ON order_header_new.order_id = oi.order_id INNER JOIN order_part op ON order_header_new.order_id = op.order_id;", nativeQuery = true)
    public String findOrdersWithItemsAndParts();

}
