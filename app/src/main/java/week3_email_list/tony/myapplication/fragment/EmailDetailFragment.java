package week3_email_list.tony.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import week3_email_list.tony.myapplication.EmailListActivity;
import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.model.Email;

/**
 * Created by tonyk_000 on 10/28/2015.
 */
public class EmailDetailFragment extends Fragment {

    private TextView mSubjectHeader;
    private TextView mAuthor;
    private TextView mEmailDate;
    private TextView mContent;
    private ImageButton mReplyAll;
    private ImageButton mReply;
    private ImageButton mForward;
    private ImageButton mOverflow;
    private ImageButton mTrash;
    private ImageButton mBackArrow;

    private Toolbar mToolbar;

    Email mEmail;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Bundle b = getActivity().getIntent().getExtras();
        mEmail = b.getParcelable(EmailListActivity.EXTRA_EMAIL);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.fragment_email_detail, container, false);

        mSubjectHeader = (TextView)v.findViewById(R.id.tv_email_subject);
        mSubjectHeader.setText(mEmail.getSubject());
        mAuthor = (TextView) v.findViewById(R.id.tv_email_author);
        mAuthor.setText(mEmail.getAuthor());
        mContent = (TextView) v.findViewById(R.id.tv_email_content);
        mContent.setText(mEmail.getBody());

        mReplyAll = (ImageButton) v.findViewById(R.id.btn_reply_all);
        mReply = (ImageButton) v.findViewById(R.id.btn_reply);
        mForward = (ImageButton) v.findViewById(R.id.btn_forward);
        mOverflow = (ImageButton) v.findViewById(R.id.btn_overflow);
        mTrash = (ImageButton) v.findViewById(R.id.btn_trash);
        mBackArrow = (ImageButton) v.findViewById(R.id.btn_back_arrow);

        mToolbar = (Toolbar) v.findViewById(R.id.tb_email_detail);

        return v;
    }
}