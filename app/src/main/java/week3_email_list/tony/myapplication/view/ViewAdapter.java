package week3_email_list.tony.myapplication.view;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.EmailDetailActivity;
import week3_email_list.tony.myapplication.ItemListener;
import week3_email_list.tony.myapplication.model.Email;
import week3_email_list.tony.myapplication.model.EmailPreview;

/**
 * Created by tonyk_000 on 10/4/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewAdapterViewHolder> implements ItemListener{

    private List<Email> mEmailPreviewList = new ArrayList<>();
    private ItemListener itemListener = new ItemListener() {
        @Override
        public void itemClicked(EmailPreview email) {
            ViewAdapterViewHolder.previewLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, EmailDetailActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    };


    public ViewAdapter(List<Email> emailPreviewList) {
        mEmailPreviewList = emailPreviewList;
    }

    @Override
    public ViewAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewAdapterViewHolder(new EmailPreviewView(viewGroup.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewAdapterViewHolder viewAdapterViewHolder, final int i) {
        viewAdapterViewHolder.previewLayout.populate(mEmailPreviewList.get(i));
    }

    @Override
    public int getItemCount() {
        return mEmailPreviewList.size();
    }

    @Override
    public void itemClicked(EmailPreview email) {

    }

    protected static class ViewAdapterViewHolder extends RecyclerView.ViewHolder{

        public static EmailPreviewView previewLayout;

        public ViewAdapterViewHolder(EmailPreviewView emailView) {
            super(emailView);
            previewLayout = emailView;
        }
    }
}
