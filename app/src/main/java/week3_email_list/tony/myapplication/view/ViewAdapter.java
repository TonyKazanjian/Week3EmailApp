package week3_email_list.tony.myapplication.view;


import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.model.EmailPreview;

/**
 * Created by tonyk_000 on 10/4/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewAdapterViewHolder>{

    private List<EmailPreview> mEmailPreviewList = new ArrayList<>();

    public ViewAdapter(List<EmailPreview> emailPreviewList) {
        mEmailPreviewList = emailPreviewList;
    }

    @Override
    public ViewAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewAdapterViewHolder(new EmailPreviewView(viewGroup.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewAdapterViewHolder viewAdapterViewHolder, int i) {
//TODO: populate
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    protected static class ViewAdapterViewHolder extends RecyclerView.ViewHolder{

        public EmailPreviewView previewLayout;

        public ViewAdapterViewHolder(EmailPreviewView emailView) {
            super(emailView);
            previewLayout = emailView;
        }
    }
}
