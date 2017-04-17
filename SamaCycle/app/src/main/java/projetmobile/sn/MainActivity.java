package projetmobile.sn;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.net.URI;
import android.os.Bundle;

import static android.R.attr.id;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(res.layout.activity_main);
        setContentView(R.layout.activity_main);
       /* Button btn = (Button) findViewById(R.layout.activity_calendrier);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,Calendrier.class);
            startActivity(intent);*/
        }

    public void PageCalendrier(View view){
        Intent intent=new Intent(this,Calendrier.class);
        startActivity(intent);
    }
    public void PageForum(View view){
        Intent intent=new Intent(this,Forum.class);
        startActivity(intent);
    }
    public void PageConseil(View view){
        Intent intent=new Intent(this,Conseil.class);
        startActivity(intent);
    }
    public void PageGyneco(View view){
        Intent intent=new Intent(this,Gyneco.class);
        startActivity(intent);
    }
}
