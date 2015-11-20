package week3_email_list.tony.myapplication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import week3_email_list.tony.myapplication.R;
import week3_email_list.tony.myapplication.view.EmailPreviewView;
import week3_email_list.tony.myapplication.view.ViewAdapter;

/**
 * Created by tonyk_000 on 10/27/2015.
 */
public class EmailListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ViewAdapter mViewAdapter;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_email_list, container, false);

        EmailPreviewView emailPreviewView = new EmailPreviewView(getActivity());

        mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_email_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mViewAdapter = new ViewAdapter(emailPreviewView.createMockContent());
        mRecyclerView.setAdapter(mViewAdapter);

        // Inflate the layout for this fragment
        return view;

    }



}
