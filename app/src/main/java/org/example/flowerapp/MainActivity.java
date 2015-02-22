package org.example.flowerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	static final String LOG_TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(LOG_TAG, "onCreate is done");
		Toast msg = Toast.makeText(this, "mainActivity created", Toast.LENGTH_LONG);
		msg.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		Log.i(LOG_TAG, "onCreateOptionsMenu is done");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		Toast.makeText(this, "You selected " + item.getTitle(), Toast.LENGTH_LONG).show();
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		Log.i(LOG_TAG, "onOptionsItemSelected");
		return super.onOptionsItemSelected(item);
	}

    public void gotoActivity(View v){

        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
