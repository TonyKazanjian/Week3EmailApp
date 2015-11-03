package week3_email_list.tony.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import week3_email_list.tony.myapplication.model.EmailPreview;

public class EmailActivity extends FragmentActivity {

    private List<EmailPreview> emailList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_email, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
