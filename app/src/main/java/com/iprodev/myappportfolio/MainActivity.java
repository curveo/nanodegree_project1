package com.iprodev.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements Button.OnClickListener {

    private Button spot;
    private Button scores;
    private Button library;
    private Button buildit;
    private Button xyz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spot = (Button) findViewById(R.id.button_spot);
        spot.setOnClickListener(this);
        scores = (Button) findViewById(R.id.button_scores);
        scores.setOnClickListener(this);
        library = (Button) findViewById(R.id.button_library);
        library.setOnClickListener(this);
        buildit = (Button) findViewById(R.id.button_build_bigger);
        buildit.setOnClickListener(this);
        xyz = (Button) findViewById(R.id.button_xyz);
        xyz.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        String txt = ((Button)v).getText().toString();
        Toast.makeText(this,getString(R.string.main_toast_string) + " " + txt, Toast.LENGTH_SHORT).show();
    }
}
