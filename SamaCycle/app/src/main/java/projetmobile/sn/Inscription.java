package projetmobile.sn;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Inscription extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }
    public void Enregistrement(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        if (v.getId() == R.id.Enregistrement) {
            EditText duree_cycle = (EditText) findViewById(R.id.dce);
            EditText derniere_regle = (EditText) findViewById(R.id.dre);
            EditText pseudo = (EditText) findViewById(R.id.pse);
            String ps = pseudo.getText().toString();

        }

    }}

    /*public void Enregistre(View v) {
        if (v.getId() == R.id.Enregistrement) {
            EditText duree_cycle = (EditText) findViewById(R.id.dce);
            EditText derniere_regle = (EditText) findViewById(R.id.dre);
            EditText pseudo = (EditText) findViewById(R.id.pse);
            String ps = pseudo.getText().toString();

        }*/
