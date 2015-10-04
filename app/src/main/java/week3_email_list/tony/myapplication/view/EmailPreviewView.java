package week3_email_list.tony.myapplication.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.model.EmailPreview;

/**
 * Created by tonyk_000 on 10/4/2015.
 */
public class EmailPreviewView extends RelativeLayout {

    TextView author;
    TextView subject;
    TextView body;
    public EmailPreviewView(Context context) {
        super(context);
    }

    public EmailPreviewView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmailPreviewView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmailPreviewView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        inflate(this.getContext(), R.layout.preview_email,this);
        author = (TextView) findViewById(R.id.tv_email_author);
        subject = (TextView) findViewById(R.id.tv_email_subject);
        body = (TextView) findViewById(R.id.tv_email_content);
    }

    public void populate(EmailPreview emailPreview){
        author.setText(emailPreview.getAuthor());
        subject.setText(emailPreview.getSubject());
        body.setText(emailPreview.getBody());
    }
}
