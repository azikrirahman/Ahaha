package com.dor.ahaha;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.Menu;
import android.view.MenuItem;

public class Index extends Activity {
	private Button btnKesenangan;
	private Button btnKesenangan2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		
		btnKesenangan = (Button) findViewById(R.id.Kesenangan);
		btnKesenangan2 = (Button) findViewById(R.id.Kesenangan2);
		
		stateAwal();
		
		btnKesenangan.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				Intent intent = new Intent(Index.this,Kesenangan.class);
				startActivity(intent);
			}
		});
		
		btnKesenangan2.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent(Index.this,Kesenangan2.class);
				startActivity(intent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.index, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void stateAwal(){
		btnKesenangan.setEnabled(true);
		btnKesenangan2.setEnabled(true);
	}
}
