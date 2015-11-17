package week3_email_list.tony.myapplication.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by tonyk_000 on 10/28/2015.
 */
public class Email {

    private Date mDate;
    private String subject;
    private String body;
    private String author;
    private UUID mId;

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
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

    public Email(String subject, String body, String author) {
        this.subject = subject;
        this.body = body;
        this.author = author;
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
