package com.mkd.project0myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mkd.myappportfolio.constants.MainActivityConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt_spotify, bt_scores, bt_library, bt_buildIt, bt_xyz, bt_capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bt_spotify = (Button) findViewById(R.id.bt_spotify);
        bt_scores = (Button) findViewById(R.id.bt_scores);
        bt_library = (Button) findViewById(R.id.bt_library);
        bt_buildIt = (Button) findViewById(R.id.buildIt);
        bt_xyz = (Button) findViewById(R.id.xyz);
        bt_capstone = (Button) findViewById(R.id.capStone);


        bt_spotify.setBackgroundColor(getResources().getColor(R.color.colorButtonGreen));
        bt_scores.setBackgroundColor(getResources().getColor(R.color.colorButtonGreen));
        bt_library.setBackgroundColor(getResources().getColor(R.color.colorButtonGreen));
        bt_buildIt.setBackgroundColor(getResources().getColor(R.color.colorButtonGreen));
        bt_xyz.setBackgroundColor(getResources().getColor(R.color.colorButtonGreen));
        bt_capstone.setBackgroundColor(getResources().getColor(R.color.colorUdacity));

        bt_spotify.setOnClickListener(this);
        bt_scores.setOnClickListener(this);
        bt_library.setOnClickListener(this);
        bt_buildIt.setOnClickListener(this);
        bt_xyz.setOnClickListener(this);
        bt_capstone.setOnClickListener(this);
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
        if(v == bt_spotify) {
            Toast.makeText(getApplicationContext(), MainActivityConstants.launchToast1 + bt_spotify.getText(), Toast.LENGTH_SHORT).show();
        }else if(v==bt_scores) {
            Toast.makeText(getApplicationContext(), MainActivityConstants.launchToast1 + bt_scores.getText(), Toast.LENGTH_SHORT).show();
        }else if(v==bt_library) {
            Toast.makeText(getApplicationContext(), MainActivityConstants.launchToast1 + bt_library.getText(), Toast.LENGTH_SHORT).show();
        }else if(v==bt_buildIt) {
            Toast.makeText(getApplicationContext(), MainActivityConstants.launchToast1 + bt_buildIt.getText(), Toast.LENGTH_SHORT).show();
        }else if(v==bt_xyz) {
            Toast.makeText(getApplicationContext(), MainActivityConstants.launchToast1 + bt_xyz.getText(), Toast.LENGTH_SHORT).show();
        }else if(v==bt_capstone) {
            Toast.makeText(getApplicationContext(), MainActivityConstants.launchToast1 + bt_capstone.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
