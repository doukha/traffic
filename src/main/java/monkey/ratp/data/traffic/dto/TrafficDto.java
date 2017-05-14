package monkey.ratp.data.traffic.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by samyboukhris on 14/05/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrafficDto {

    private String line;
    private String slug;
    private String title;
    private String message;


    public TrafficDto(String line, String slug, String title, String message) {
        this.line = line;
        this.slug = slug;
        this.title = title;
        this.message = message;
    }

    public TrafficDto(Result result) {
        this(result.getLine(), result.getSlug(), result.getTitle(), result.getMessage());
    }

    public TrafficDto() {
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
