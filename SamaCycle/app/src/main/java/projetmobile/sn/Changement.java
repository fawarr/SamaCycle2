package projetmobile.sn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Changement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changement);
    }
    public void Inscrit(View view) {
        Intent intent = new Intent(this, Inscription.class);
        startActivity(intent);
    }
    public void Continuer(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
