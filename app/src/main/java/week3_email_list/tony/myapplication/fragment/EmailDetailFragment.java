package week3_email_list.tony.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.view.ViewAdapter;

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

    LinearLayout mLinearLayout;
    private ViewAdapter mViewAdapter;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View v = inflater.inflate(R.layout.fragment_email_detail, container, false);

        mSubjectHeader = (TextView)v.findViewById(R.id.tv_email_subject);
        mAuthor = (TextView) v.findViewById(R.id.tv_email_author);
        mEmailDate = (TextView) v.findViewById(R.id.tv_email_date);
        mContent = (TextView) v.findViewById(R.id.tv_email_content);
        mReplyAll = (ImageButton) v.findViewById(R.id.btn_reply_all);
        mReply = (ImageButton) v.findViewById(R.id.btn_reply);
        mForward = (ImageButton) v.findViewById(R.id.btn_forward);
        mOverflow = (ImageButton) v.findViewById(R.id.btn_overflow);
        mTrash = (ImageButton) v.findViewById(R.id.btn_trash);
        mBackArrow = (ImageButton) v.findViewById(R.id.btn_back_arrow);

        return v;
    }
}