package uz.netex.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.netex.school.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
