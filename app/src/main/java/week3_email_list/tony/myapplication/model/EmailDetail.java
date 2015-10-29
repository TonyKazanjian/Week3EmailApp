package week3_email_list.tony.myapplication.model;

/**
 * Created by tonyk_000 on 10/28/2015.
 */
public class EmailDetail {

    private String subject;
    private String body;
    private String author;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public EmailDetail (String subject, String body, String author) {
        this.subject = subject;
        this.body = body;
        this.author = author;
    }
}
