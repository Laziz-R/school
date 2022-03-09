package uz.netex.school.entity.address;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private Long id;
    @ManyToOne
    private District district;
    private String street;
    private String houseNumber;
}
