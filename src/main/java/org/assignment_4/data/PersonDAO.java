package org.assignment_4.data;

import org.assignment_4.model.Person;

import java.util.Collection;
import java.util.Optional;

public interface PersonDAO {
    Person create(Person person);

    Optional<Person> findById(int id);

    Optional<Person> findByEmail(String email);

    Collection<Person> findAll();

    boolean remove(int id);

}
