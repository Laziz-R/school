package uz.netex.school.dto.address;

import lombok.Data;
import uz.netex.school.entity.BaseEntity;
import uz.netex.school.entity.address.Region;

@Data
public class RegionDto extends BaseEntity {
    private String name;

    public static RegionDto toDto(Region region) {
        RegionDto regionDto = new RegionDto();
        regionDto.setId(region.getId());
        regionDto.setName(region.getName());
        return regionDto;
    }

    public static Region toEntity(RegionDto regionDto) {
        Region region = new Region();
        region.setId(regionDto.getId());
        region.setName(regionDto.getName());
        return region;
    }

}
