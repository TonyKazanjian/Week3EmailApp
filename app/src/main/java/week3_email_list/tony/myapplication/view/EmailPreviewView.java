package week3_email_list.tony.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.model.EmailPreview;

/**
 * Created by tonyk_000 on 10/4/2015.
 */
public class EmailPreviewView extends LinearLayout {

    TextView author;
    TextView subject;
    TextView body;

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

    private void init(){
        this.setOrientation(LinearLayout.HORIZONTAL);
        inflate(this.getContext(), R.layout.preview_email, this);
        author = (TextView) findViewById(R.id.tv_email_author);
        subject = (TextView) findViewById(R.id.tv_email_subject);
        body = (TextView) findViewById(R.id.tv_email_content);
    }

    public void populate(EmailPreview emailPreview){
        //TODO: not sure why setText invokes on a null object reference
        author.setText(emailPreview.getAuthor());
        subject.setText(emailPreview.getSubject());
        body.setText(emailPreview.getBody());
    }
}
