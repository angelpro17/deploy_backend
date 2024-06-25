package unirider.platform.profiles.infrastructure.persistence.jpa.repositories;

import unirider.platform.profiles.domain.model.aggregates.Driver;
import unirider.platform.profiles.domain.model.valueobjects.DriverName;
import unirider.platform.profiles.domain.model.valueobjects.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findDriverByDriverName(DriverName driverName);
    Optional<Driver> findDriverByDriverLicense(DriverLicense driverLicense);
}
