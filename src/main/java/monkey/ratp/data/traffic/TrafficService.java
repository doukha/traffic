package monkey.ratp.data.traffic;

import io.reactivex.Observable;
import monkey.ratp.data.traffic.dto.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * Created by samyboukhris on 14/05/2017.
 */
@Service
public class TrafficService {

    public static final String trafficUri = "https://api-ratp.pierre-grimaud.fr/v3/traffic";
    private Long interval;

    @Autowired
    public TrafficService(@Value("${interval}") Long interval) {
        this.interval = interval;
    }

    public Observable<String> obsTraffic(String type, String code) {
        RestTemplate restTemplate = new RestTemplate();
        return Observable.interval(interval, TimeUnit.SECONDS).timeInterval()
                         .flatMap((x) -> Observable.just(getTraffic(restTemplate, type, code)));
    }

    private String getTraffic(RestTemplate restTemplate, String type, String code) {
        ResultDto forObject = restTemplate.getForObject(trafficUri + "/" + type + "/" + code, ResultDto.class);
        return forObject.getResult().getSlug();
    }
}
