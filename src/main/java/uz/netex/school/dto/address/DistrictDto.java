package uz.netex.school.dto.address;

import lombok.Getter;
import lombok.Setter;
import uz.netex.school.entity.address.District;

@Getter
@Setter
public class DistrictDto {
    private Long id;
    private String name;
    private String region;

    public static DistrictDto toDto(District district) {
        DistrictDto dto = new DistrictDto();
        dto.setId(district.getId());
        dto.setName(district.getName());
        dto.setRegion(district.getRegion().getName());
        return dto;
    }
}
