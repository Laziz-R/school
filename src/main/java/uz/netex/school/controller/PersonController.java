package uz.netex.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.netex.school.entity.Person;
import uz.netex.school.service.PersonService;

import java.util.List;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getAll() {
        List<Person> personList = personService.getAll();
        return ResponseEntity.ok(personList);
    }

    @GetMapping("/api/person/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Person person = personService.getById(id);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/api/person")
    public ResponseEntity<Person> deletePerson(@RequestBody Person person) {
        personService.delete(person);
        return ResponseEntity.ok(person);
    }

    @PutMapping("/api/person")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.ok(person);
    }
}
