package com.training.gradle.core.app;

import com.training.gradle.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {

        return personDao.insertPerson(person);
    }

    public List<Person> getAllPerson() {
        return personDao.getAllPersons();
    }

    public Person getPersonById(UUID personId) {

        Optional<Person>  optionalPerson = personDao.getPersonById(personId);
        return optionalPerson.orElse(null);
    }

    public int removePerson(UUID personId) {
        return personDao.removePerson(personId);
    }


    public int updatePerson(UUID personId, Person person) {
        return personDao.updatePerson(personId, person);
    }
}

