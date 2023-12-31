package com.rohan.restapis.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "party_id")
    private String partyId;
    @Column(name = "salutation")
    private String personSalutation;

    @Column(name= "first_name")
    private String firstName;

    @Column(name="middle_name")
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "martial_status_enum_id")
    private String maritalStatusEnumId;
    @Column(name="employment_status_enum_id")
    private String employmentStatusEnumId;
    @Column(name="occupation")
    private String occupation;


//    @ManyToOne
//    @JoinColumn(name = "party_id", referencedColumnName = "party_id")
//    private Party party;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public void setPersonSalutation(String personSalutation) {
        this.personSalutation = personSalutation;
    }

    public String getPersonSalutation() {
        return personSalutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatusEnumId() {
        return maritalStatusEnumId;
    }

    public void setMaritalStatusEnumId(String maritalStatusEnumId) {
        this.maritalStatusEnumId = maritalStatusEnumId;
    }

    public String getEmploymentStatusEnumId() {
        return employmentStatusEnumId;
    }

    public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
        this.employmentStatusEnumId = employmentStatusEnumId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
