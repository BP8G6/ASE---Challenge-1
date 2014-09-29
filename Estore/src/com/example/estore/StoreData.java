package com.example.estore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StoreData extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.storedata);
		
		Button bt_findstore =(Button)findViewById(R.id.btnfindstore);  //OnClick for finding grocery store
		bt_findstore.setOnClickListener(this);
		
		Button bt_storeonline =(Button)findViewById(R.id.btnonlinestore);  //OnClick for Onlinestore
		bt_storeonline.setOnClickListener(this);
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
	      case R.id.btnfindstore: 
	             Intent in_store = new Intent(StoreData.this,MapView.class);
	             //Log.v("Balakrishna","balakrishna");
	             startActivity(in_store);
	         break;
	      case R.id.btnonlinestore:
	    	  Intent in_recipies = new Intent(StoreData.this,EstoreHome.class);
	    	   startActivity(in_recipies); 
	         break;

}
	}
}
