package GPS.CO.services;

import GPS.CO.models.GpsDeviceInfos;
import GPS.CO.repositories.GpsDeviceInfosRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GpsDeviceInfoService {

    private final GpsDeviceInfosRepository gpsDeviceInfosRepository;

    public GpsDeviceInfoService(GpsDeviceInfosRepository gpsDeviceInfosRepository) {
        this.gpsDeviceInfosRepository = gpsDeviceInfosRepository;
    }



    public List<GpsDeviceInfos> getAllPositionDeviceByIdDevice(int idDevice) {
        try{
//            List<GpsDeviceInfos> infos = gpsDeviceInfosRepository.findAllByIdDevice(idDevice);
//            for (GpsDeviceInfos info : infos) {
//                System.out.println(info.getLatitude() + " " + info.getLongitude());
//            }
            return gpsDeviceInfosRepository.findAllByIdDevice(idDevice);
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<GpsDeviceInfos>();
        }
    }


}
