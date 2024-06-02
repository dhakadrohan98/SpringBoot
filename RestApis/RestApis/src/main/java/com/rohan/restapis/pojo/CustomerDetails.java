package com.rohan.restapis.pojo;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class CustomerDetails {
    private String customerPartyId;
    private String firstName;
    private String middleName;
    private String lastName;

    public CustomerDetails(String customerPartyId, String firstName, String middleName, String lastName) {
        this.customerPartyId = customerPartyId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
