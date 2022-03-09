package uz.netex.school.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pupil {
    @Id
    private Long id;
    @OneToOne
    private Person person;
}
