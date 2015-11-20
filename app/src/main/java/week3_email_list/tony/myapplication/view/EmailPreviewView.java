package week3_email_list.tony.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.model.Email;

/**
 * Created by tonyk_000 on 10/4/2015.
 */
public class EmailPreviewView extends LinearLayout {

    private TextView author;
    private TextView subject;
    private TextView body;

    private List<Email> mEmails;

    public EmailPreviewView(Context context) {
        this(context, null);
    }

    public EmailPreviewView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EmailPreviewView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public List<Email> createMockContent (){

        mEmails = new ArrayList<>();

        for (int i = 0; i < 12; i++){
            Email email = new Email(R.string.placeholder_author1,R.string.placeholder_content1,R.string.placeholder_subject1);
            email.setAuthor(R.string.placeholder_author1);
            email.setSubject(R.string.placeholder_subject1);
            email.setBody(R.string.placeholder_content1);

            mEmails.add(email);
        }
        return mEmails;
    }

    private void init(){
        this.setOrientation(LinearLayout.HORIZONTAL);
        inflate(this.getContext(), R.layout.preview_email, this);
        author = (TextView) findViewById(R.id.tv_email_author);
        subject = (TextView) findViewById(R.id.tv_email_subject);
        body = (TextView) findViewById(R.id.tv_email_content);
    }

    public void populate(Email emailPreview){
        author.setText(emailPreview.getAuthor());
        subject.setText(emailPreview.getSubject());
        body.setText(emailPreview.getBody());
    }
}
