package uz.netex.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.function.EntityResponse;
import uz.netex.school.dto.address.RegionDto;
import uz.netex.school.entity.address.Region;
import uz.netex.school.service.address.RegionService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/region")
public class RegionController {
    private final RegionService service;

    @PostMapping
    public ResponseEntity<RegionDto> add(@RequestBody RegionDto regionDto) {
        RegionDto savedRegionDto =  service.add(regionDto);
        return ResponseEntity.ok(savedRegionDto);
    }

    @GetMapping
    public ResponseEntity<List<RegionDto>> getList() {
        List<RegionDto> regionList = service.getAll();
        return ResponseEntity.ok(regionList);
    }
}
