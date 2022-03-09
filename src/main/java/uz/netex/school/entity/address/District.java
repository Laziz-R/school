package uz.netex.school.entity.address;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.netex.school.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class District extends BaseEntity {
    private String name;
    @ManyToOne
    private Region region;
}
