package mostafa.com.sequoiarestaurant;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //open facebook page
        final TextView myClickableUrl = findViewById(R.id.facebook);
        myClickableUrl.setText("Our facebook: facebook.com/sequoiaonline/");
        Linkify.addLinks(myClickableUrl, Linkify.WEB_URLS);
    }
}
