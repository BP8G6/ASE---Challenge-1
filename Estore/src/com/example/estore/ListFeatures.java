package com.example.estore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListFeatures extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_features);
		
		Button bt_grocery =(Button)findViewById(R.id.btngrstore);  //OnClick for Sign Grocery store
		bt_grocery.setOnClickListener(this);
		
		Button bt_recipies =(Button)findViewById(R.id.btnrecipies);  //OnClick for Recipies
		bt_recipies.setOnClickListener(this);
		
		Button bt_scanner=(Button)findViewById(R.id.btnscanner);	//OnClick for Scanner
		bt_scanner.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
	      case R.id.btngrstore: 
	             Intent in_store = new Intent(ListFeatures.this,StoreData.class);
	             startActivity(in_store);
	         break;
	      case R.id.btnrecipies:
	    	  Intent in_recipies = new Intent(ListFeatures.this,EstoreHome.class);
	    	   startActivity(in_recipies); 
	         break;
	     case R.id.btnscanner:
	    	  Intent in_scan = new Intent(ListFeatures.this,Scanner.class);
	             startActivity(in_scan);
	         break;
		
	}

}
	}

