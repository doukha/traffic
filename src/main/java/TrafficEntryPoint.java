import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by samyboukhris on 13/05/2017.
 */

@ComponentScan("monkey.ratp.data.traffic")
@PropertySource("classpath:traffic.properties")
@SpringBootApplication
class TrafficEntryPoint {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TrafficEntryPoint.class, args);
    }
}
