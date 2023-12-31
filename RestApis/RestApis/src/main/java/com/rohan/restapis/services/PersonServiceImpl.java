package com.rohan.restapis.services;

import com.rohan.restapis.entities.Person;
import com.rohan.restapis.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;
    @Override
    public List<Person> getPersonList() {
        return this.personRepository.findAll();
    }

    @Override
    public Person getPersonById(String partyId) {
        return this.personRepository.findById(partyId).get();
    }

    @Override
    public Person createPerson(Person person) {
        try {
            return this.personRepository.save(person);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occurs: "+e.getMessage());
            return null;
        }
    }

    @Override
    public Person updatePersonById(String partyId, Person person) {
        Person personObj = this.personRepository.findById(partyId).get();
        personObj.setPartyId(person.getPartyId());
        personObj.setPersonSalutation(person.getPersonSalutation());
        personObj.setFirstName(person.getFirstName());
        personObj.setMiddleName(person.getMiddleName());
        personObj.setLastName(person.getFirstName());
        personObj.setGender(person.getGender());
        personObj.setBirthDate(person.getBirthDate());
        personObj.setMaritalStatusEnumId(person.getMaritalStatusEnumId());
        personObj.setEmploymentStatusEnumId(person.getEmploymentStatusEnumId());
        personObj.setOccupation(person.getOccupation());

        return this.personRepository.save(personObj);
    }

    @Override
    public void deletePersonById(String partyId) {
        this.personRepository.deleteById(partyId);
    }
}
