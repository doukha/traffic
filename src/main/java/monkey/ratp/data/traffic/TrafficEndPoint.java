package monkey.ratp.data.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by samyboukhris on 13/05/2017.
 */
@RestController()
@RequestMapping("/traffic")
public class TrafficEndPoint {

    private TrafficService trafficService;

    @Autowired
    public TrafficEndPoint(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{type}/{code}")
    @ResponseBody
    public String getTraffic(@PathVariable("type") String type, @PathVariable("code") String code) {
        return this.trafficService.obsTraffic(type, code).firstElement().blockingGet();

    }

}
