package uz.netex.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.netex.school.entity.address.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
