package week3_email_list.tony.myapplication.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.widget.TextView;

/**
 * Created by tonyk_000 on 10/28/2015.
 */
public class EmailDetailFragment extends Fragment {

    public TextView mSubjectHeader;
    public TextView mAuthor;
    public TextView mEmailDate;


    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
}
