package week3_email_list.tony.myapplication.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tonyk_000 on 10/28/2015.
 */
public class Email implements Parcelable {

    private int subject;
    private int body;
    private int author;

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public Email(int subject, int body, int author) {
        this.subject = subject;
        this.body = body;
        this.author = author;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.subject);
        dest.writeInt(this.body);
        dest.writeInt(this.author);
    }

    protected Email(Parcel in) {
        this.subject = in.readInt();
        this.body = in.readInt();
        this.author = in.readInt();
    }

    public static final Creator<Email> CREATOR = new Creator<Email>() {
        public Email createFromParcel(Parcel source) {
            return new Email(source);
        }

        public Email[] newArray(int size) {
            return new Email[size];
        }
    };
}
//TODO: pass off email object with putParcelable (create a bundle and call put parcelable)
