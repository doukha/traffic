package monkey.ratp.data.traffic.dto;

/**
 * Created by samyboukhris on 14/05/2017.
 */
public class Result {
    private String message;

    private String title;

    private String line;

    private String slug;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "ClassPojo [message = " + message + ", title = " + title + ", line = " + line + ", slug = " + slug + "]";
    }
}
