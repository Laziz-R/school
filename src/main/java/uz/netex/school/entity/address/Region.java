package uz.netex.school.entity.address;

import lombok.Data;
import uz.netex.school.entity.BaseEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Region extends BaseEntity {
    private String name;
}
