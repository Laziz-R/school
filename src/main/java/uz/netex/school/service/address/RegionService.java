package uz.netex.school.service.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.netex.school.dto.address.RegionDto;
import uz.netex.school.entity.address.Region;
import uz.netex.school.repository.RegionRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository repository;

    public RegionDto add(RegionDto regionDto){
        Region region = RegionDto.toEntity(regionDto);
        repository.save(region);
        return RegionDto.toDto(region);
    }

    public List<RegionDto> getAll() {
        List<RegionDto> dtoList = repository.findAll().stream().map(RegionDto::toDto).collect(Collectors.toList());
        return dtoList;
    }
}
