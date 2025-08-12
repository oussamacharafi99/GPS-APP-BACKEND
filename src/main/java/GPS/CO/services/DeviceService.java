package GPS.CO.services;

import GPS.CO.models.Device;
import GPS.CO.models.GpsDeviceInfos;
import GPS.CO.repositories.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Device> getAllDevices() {
        try{
            return deviceRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
