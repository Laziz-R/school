package uz.netex.school.dto.address;

import lombok.Data;
import uz.netex.school.entity.address.District;
import uz.netex.school.entity.address.Region;

@Data
public class DistrictForm {
    private String name;
    private Long regionId;

    public District toEntity() {
        District district = new District();
        district.setName(this.name);

        Region region = new Region();
        region.setId(this.regionId);
        district.setRegion(region);

        return district;
    }
}
