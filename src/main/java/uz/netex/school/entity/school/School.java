package uz.netex.school.entity.school;

import uz.netex.school.entity.address.Address;

import javax.persistence.*;

@Entity
public class School {
    @Id
    private Long id;
    private String number;
    private String name;
    @ManyToOne
    private SchoolType type;
    @OneToOne
    private Address address;
}
