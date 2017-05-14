package monkey.ratp.data.traffic.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samyboukhris on 14/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultDto {

    private Result result;


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }


    @Override
    public String toString() {
        return "ClassPojo [result = " + result + ", _metad";
    }

}
