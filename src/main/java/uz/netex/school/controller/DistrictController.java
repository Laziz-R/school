package uz.netex.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.netex.school.dto.address.DistrictDto;
import uz.netex.school.dto.address.DistrictForm;
import uz.netex.school.service.address.DistrictService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/district")
public class DistrictController {

    private final DistrictService service;

    @PostMapping
    public ResponseEntity<DistrictDto> add(@RequestBody DistrictForm form) {
        DistrictDto savedDistrictDto = service.add(form);
        return ResponseEntity.ok(savedDistrictDto);
    }

    @GetMapping
    public ResponseEntity<List<DistrictDto>> getAll() {
        List<DistrictDto> districtDtoList = service.getAll();
        return ResponseEntity.ok(districtDtoList);
    }
}
