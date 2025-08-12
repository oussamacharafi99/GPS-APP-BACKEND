package GPS.CO.controllers;

import GPS.CO.models.GpsDeviceInfos;
import GPS.CO.repositories.GpsDeviceInfosRepository;
import GPS.CO.services.GpsDeviceInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gps_infos")
public class GpsDeviceInfosController {

    private final GpsDeviceInfoService gpsDeviceInfoService ;

    public GpsDeviceInfosController(GpsDeviceInfoService gpsDeviceInfoService) {
        this.gpsDeviceInfoService = gpsDeviceInfoService;
    }


    @GetMapping("/get_by_id_device/{idDevice}")
    public List<GpsDeviceInfos> getAllByIdDevice(@PathVariable int idDevice) {
        return gpsDeviceInfoService.getAllPositionDeviceByIdDevice(idDevice);
    }

}
