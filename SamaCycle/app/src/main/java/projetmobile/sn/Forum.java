package projetmobile.sn;

import android.nfc.Tag;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.app.FragmentActivity;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Forum extends AppCompatActivity {

    private static final String TAG = "activity_forum";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... params) {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url("http//192.168.56.1/android/affichage_bd.php").build();

                try {
                    Response response = client.newCall(request).execute();
                    Log.d(TAG, "doInBackground() called with :" + "params =[" + response.body().string() + "]");
                    return response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return null;
            }

// <>


        }.execute();

    }
}
