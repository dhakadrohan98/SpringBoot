package com.rohan.restapis.repositories;

import com.rohan.restapis.entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPartyRepository extends JpaRepository<Party, String> {
}
