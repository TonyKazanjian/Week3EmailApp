package week3_email_list.tony.myapplication.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.model.EmailPreview;
import week3_email_list.tony.myapplication.view.ViewAdapter;

/**
 * Created by tonyk_000 on 10/27/2015.
 */
public class EmailListFragment extends Fragment {

    private List<EmailPreview> emailList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ViewAdapter mViewAdapter;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.activity_email, container, false);

        mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_email_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mViewAdapter = new ViewAdapter(createMockContent());
        mRecyclerView.setAdapter(mViewAdapter);
        // Inflate the layout for this fragment
        return view;

    }

    private List<EmailPreview> createMockContent(){
        EmailPreview emailPreview1 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview2 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview3 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview4 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview5 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview6 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview7 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview8 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview9 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));
        EmailPreview emailPreview10 = new EmailPreview(getString(R.string.placeholder_subject), getString(R.string.placeholder_content),getString(R.string.placeholder_author));

        emailList.add(emailPreview1);
        emailList.add(emailPreview2);
        emailList.add(emailPreview3);
        emailList.add(emailPreview4);
        emailList.add(emailPreview5);
        emailList.add(emailPreview6);
        emailList.add(emailPreview7);
        emailList.add(emailPreview8);
        emailList.add(emailPreview9);
        emailList.add(emailPreview10);

        return emailList;
    }

}
