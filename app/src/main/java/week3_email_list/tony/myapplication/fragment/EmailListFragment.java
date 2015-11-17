package week3_email_list.tony.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.model.Email;
import week3_email_list.tony.myapplication.view.ViewAdapter;

/**
 * Created by tonyk_000 on 10/27/2015.
 */
public class EmailListFragment extends Fragment {

    private List<Email> emailList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ViewAdapter mViewAdapter;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_email_list, container, false);

        mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_email_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mViewAdapter = new ViewAdapter(createMockContent());
        mRecyclerView.setAdapter(mViewAdapter);

        // Inflate the layout for this fragment
        return view;

    }

    private List<Email> createMockContent(){
        Email emailPreview1 = new Email(getString(R.string.placeholder_subject1), getString(R.string.placeholder_content1),getString(R.string.placeholder_author1));
        Email emailPreview2 = new Email(getString(R.string.placeholder_subject2), getString(R.string.placeholder_content2),getString(R.string.placeholder_author2));
        Email emailPreview3 = new Email(getString(R.string.placeholder_subject1), getString(R.string.placeholder_content1),getString(R.string.placeholder_author1));
        Email emailPreview4 = new Email(getString(R.string.placeholder_subject2), getString(R.string.placeholder_content2),getString(R.string.placeholder_author2));
        Email emailPreview5 = new Email(getString(R.string.placeholder_subject1), getString(R.string.placeholder_content1),getString(R.string.placeholder_author1));
        Email emailPreview6 = new Email(getString(R.string.placeholder_subject2), getString(R.string.placeholder_content2),getString(R.string.placeholder_author2));
        Email emailPreview7 = new Email(getString(R.string.placeholder_subject1), getString(R.string.placeholder_content1),getString(R.string.placeholder_author1));
        Email emailPreview8 = new Email(getString(R.string.placeholder_subject2), getString(R.string.placeholder_content2),getString(R.string.placeholder_author2));
        Email emailPreview9 = new Email(getString(R.string.placeholder_subject1), getString(R.string.placeholder_content1),getString(R.string.placeholder_author1));
        Email emailPreview10 = new Email(getString(R.string.placeholder_subject2), getString(R.string.placeholder_content2),getString(R.string.placeholder_author2));

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
