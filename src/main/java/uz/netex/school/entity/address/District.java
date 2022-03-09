package uz.netex.school.entity.address;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class District {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    private Region region;
}
