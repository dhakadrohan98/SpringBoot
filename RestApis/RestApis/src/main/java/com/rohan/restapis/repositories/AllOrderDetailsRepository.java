package com.rohan.restapis.repositories;

import com.rohan.restapis.entities.AllOrderDetails;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllOrderDetailsRepository extends JpaRepository<AllOrderDetails, String> {

}
