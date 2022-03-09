package uz.netex.school.service.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.netex.school.dto.address.DistrictDto;
import uz.netex.school.dto.address.DistrictForm;
import uz.netex.school.entity.address.District;
import uz.netex.school.entity.address.Region;
import uz.netex.school.repository.DistrictRepository;
import uz.netex.school.repository.RegionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DistrictService {
    private final DistrictRepository repository;
    private final RegionRepository regionRepository;

    public DistrictDto add(DistrictForm form) {
        Region region = regionRepository.findById(form.getRegionId()).orElseThrow(() -> new RuntimeException("Region doesn't exist!"));
        District savedDistrict = repository.save(form.toEntity());
        savedDistrict.setRegion(region);
        return DistrictDto.toDto(savedDistrict);
    }

    public List<DistrictDto> getAll() {
        return repository.findAll().stream().map(DistrictDto::toDto).collect(Collectors.toList());
    }

}
