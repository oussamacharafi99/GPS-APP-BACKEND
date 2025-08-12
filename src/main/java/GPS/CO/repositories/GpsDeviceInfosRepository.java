package GPS.CO.repositories;


import GPS.CO.models.GpsDeviceInfos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface GpsDeviceInfosRepository extends JpaRepository<GpsDeviceInfos, LocalDateTime> {

    List<GpsDeviceInfos> findAllByIdDevice(int idDevice);
}
