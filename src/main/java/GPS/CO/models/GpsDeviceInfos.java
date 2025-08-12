package GPS.CO.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "arch_1004901")
public class GpsDeviceInfos {
    @Id
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "id_device")
    private int idDevice;
    private int speed;
    private int fuel;
    private String temp;
    private int X;
    private int Y;
    private int Z;
    private int ignition;
    private int rpm;
    private double fuel_rate;
    private double tfu;
    private double odo;
    private int SatInView;
    private int signal;
    private int heading;
    private int charger;
    private Double latitude;
    private Double longitude;
    private Integer state;
    private Integer tram_id;
    private Integer validity;
    private Integer temp_engine;
    private Float accum_odo;
    private Integer do1;
    private Integer do2;
    private Integer do3;
    private Integer do4;
    private Integer di1;
    private Integer di2;
    private Integer di3;
    private Integer di4;
    private Integer an1;
    private Integer an2;
    private Integer an3;
    private Integer an4;
}
