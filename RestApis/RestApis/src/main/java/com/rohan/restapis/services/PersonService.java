package com.rohan.restapis.services;

import com.rohan.restapis.entities.Person;

import java.util.List;

public interface PersonService {

    public List<Person> getPersonList();

    public Person getPersonById(String partyId);

    public Person createPerson(Person person);

    public Person updatePersonById(String partyId, Person person);

    public void deletePersonById(String partyId);
}
