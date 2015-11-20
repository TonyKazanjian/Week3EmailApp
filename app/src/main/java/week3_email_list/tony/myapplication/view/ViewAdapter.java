package week3_email_list.tony.myapplication.view;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.EmailListActivity;
import week3_email_list.tony.myapplication.model.Email;

/**
 * Created by tonyk_000 on 10/4/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewAdapterViewHolder> {

    private List<Email> mEmailPreviewList = new ArrayList<>();


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

    protected static class ViewAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public static EmailPreviewView previewLayout;

        public ViewAdapterViewHolder(EmailPreviewView emailView) {
            super(emailView);
            previewLayout = emailView;
            previewLayout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Context context = v.getContext();
            Intent intent = EmailListActivity.newIntent(context,previewLayout.createMockContent().get(0));
            context.startActivity(intent);
        }
    }
}
