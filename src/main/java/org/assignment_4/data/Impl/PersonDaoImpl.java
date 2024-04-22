package org.assignment_4.data.Impl;

import org.assignment_4.data.PersonDAO;
import org.assignment_4.data.sequencer.PersonIdSequencer;
import org.assignment_4.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class PersonDaoImpl implements PersonDAO {
    private List<Person> storage = new ArrayList<>();

    @Override
    public Person create(Person person) {
        if (person == null) throw new IllegalArgumentException("Person Data is null");
        Optional<Person> personOptional = findById(person.getId());
        if (personOptional.isPresent()) throw new IllegalArgumentException("Person is duplicate");
        int id = PersonIdSequencer.nextId();
        person.setId(id);
        storage.add(person);
        return person;
    }

    @Override
    public Optional<Person> findById(int id) {
        for (Person person : storage){
            if (person.getId() == id) return Optional.of(person);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        for (Person person : storage){
            if (person.getEmail().equals(email)) return Optional.of(person);
        }
        return Optional.empty();
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public boolean remove(int id) {
        Optional<Person> personOptional = findById(id);
        if (!personOptional.isPresent()) return false;
        storage.remove(personOptional.get());
        return true;
    }
}
