package uz.netex.school.service;

import org.springframework.stereotype.Service;
import uz.netex.school.entity.Person;
import uz.netex.school.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(Long id) {
        return personRepository.getById(id);
    }

    public void delete(Person person) {
        personRepository.delete(person);
    }
}
