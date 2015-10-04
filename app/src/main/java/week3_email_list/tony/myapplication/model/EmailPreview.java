package week3_email_list.tony.myapplication.model;

/**
 * Created by tonyk_000 on 10/3/2015.
 */
public class EmailPreview {

    private String subject;
    private String body;
    private String author;

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

    public EmailPreview(String subject, String body, String author) {
        this.subject = subject;
        this.body = body;
        this.author = author;
    }
}
