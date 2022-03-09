package uz.netex.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.netex.school.dto.address.RegionDto;
import uz.netex.school.service.address.RegionService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/region")
public class RegionController {
    private final RegionService service;

    @PostMapping
    public RegionDto add(@RequestBody RegionDto regionDto) {
        return service.add(regionDto);
    }

    @GetMapping
    public List<RegionDto> getList() {
        return service.getAll();
    }
}
