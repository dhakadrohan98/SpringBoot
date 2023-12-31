package com.rohan.restapis.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "party")
public class Party {
    @Id
    @Column(name = "party_id")
    private String partyId;

    @Column(name = "party_type_enum_id")
    private String partyTypeEnumId;
}
