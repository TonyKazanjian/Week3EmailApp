package week3_email_list.tony.myapplication.model;

/**
 * Created by tonyk_000 on 10/28/2015.
 */
public class EmailDetail {

    private String date;
    private EmailPreview emailPreview;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return emailPreview.getSubject();
    }

    public String getBody() {
        return emailPreview.getBody();
    }

    public String getAuthor() {
        return emailPreview.getAuthor();
    }

    public EmailDetail (EmailPreview emailPreview) {
        emailPreview = new EmailPreview(emailPreview.getSubject(),emailPreview.getBody(),emailPreview.getAuthor());
    }
}
