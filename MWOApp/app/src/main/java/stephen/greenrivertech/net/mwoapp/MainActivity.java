package stephen.greenrivertech.net.mwoapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public static final String URL = "http://static.mwomercs.com/api/mechs/list/dict.json";
    public static final String MECH_URL = "http://static.mwomercs.com/api/mechs/view/";
    public static final String MECH_ICON_URL = "http://static.mwomercs.com/img/theme/battlemechs/";

    private EditText urlText;
    private TextView textView;
    ServiceHandler serviceHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.connection);


        // Gets the URL from the UI's text field.
        String stringUrl = URL;//urlText.getText().toString();
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            serviceHandler = new ServiceHandler(stringUrl, textView, this);
            serviceHandler.InitiateDownload();
        } else {
            textView.setText("No network connection available.");
        }
    }


}
