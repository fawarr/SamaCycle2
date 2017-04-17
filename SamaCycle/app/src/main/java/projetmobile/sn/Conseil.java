package projetmobile.sn;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class Conseil extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conseil);
    }
    public void PageAstuce(View view){
        Intent intent=new Intent(this,AstucesPratiques.class);
        startActivity(intent);
    }
    public void PageDivers(View view){
        Intent intent=new Intent(this,Divers.class);
        startActivity(intent);
    }
    public void PageSanteH(View view){
        Intent intent=new Intent(this,SanteHygiene.class);
        startActivity(intent);
    }
}
