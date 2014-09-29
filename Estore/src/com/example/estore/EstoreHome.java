package com.example.estore;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

public class EstoreHome extends Activity implements OnChildClickListener {
	
	ExtendedListAdapter listAdapter;
	ExpandableListView Listfeature;
	List<String> listItemHeader;
	HashMap<String, List<String>> listItemChild;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.estore_home);
		
		
		Listfeature = (ExpandableListView) findViewById(R.id.listfeature);
		Listfeature.setOnChildClickListener(new OnChildClickListener() {
	@Override
	public boolean onChildClick(ExpandableListView parent, View v,int groupPosition, int childPosition, long id) {
		Intent i_items=new Intent(EstoreHome.this, MainActivity.class);
		startActivity(i_items);
		return false;
	}
		});
		
		ListItemsData();
		
		listAdapter = new ExtendedListAdapter(EstoreHome.this, listItemHeader, listItemChild);

		// setting list adapter
		Listfeature.setAdapter(listAdapter);
}

	private void ListItemsData()
	{
		
		listItemHeader = new ArrayList<String>();
		listItemChild = new HashMap<String, List<String>>();
		
		// Adding child data
				listItemHeader.add("Frozen Foods");
				listItemHeader.add("Beverages");
				listItemHeader.add("Canned Goods");
				listItemHeader.add("Pet Food");
				listItemHeader.add("Vegetables");
				listItemHeader.add("Cleaning Supplies");

				listItemHeader.add("Coming Soon..");

				// Adding child data
				List<String> frozen = new ArrayList<String>();
				frozen.add("Meat");
				frozen.add("Seafood");
				frozen.add("Pizza");
				frozen.add("Frozen Wraps");
				frozen.add("Frozen sandwiches");

				List<String> Beverages = new ArrayList<String>();
				Beverages.add("Coke");
				Beverages.add("Pepsi");
				Beverages.add("Sprite");
				Beverages.add("Red Bull");
				Beverages.add("Brezers");

				List<String> Canned = new ArrayList<String>();
				Canned.add("Applesause ");
				Canned.add("Beans");
				Canned.add("Stocks and broths");
				Canned.add("Sweer corn");
				Canned.add("Yams");
				

				List<String> pet = new ArrayList<String>();
				pet.add("Canned Dog Food");
				pet.add("Canned Bird Food ");
				pet.add("Canned Cat Fod ");

				List<String> Vegetables = new ArrayList<String>();
				Vegetables.add("Vegetables");
				Vegetables.add("Fruits");

				List<String> Cleaning = new ArrayList<String>();
				Cleaning.add("Carpet & Floor Cleaner");
				Cleaning.add("Surface Care");
				Cleaning.add("Cleaning Tools");
				Cleaning.add("Drain & Septic Care");

				List<String> coming = new ArrayList<String>();
				coming.add("WorldFoods");
				coming.add("Home Linen");
				coming.add("Home Care");
				
				
				listItemChild.put(listItemHeader.get(0), frozen); // Header, Child data
				listItemChild.put(listItemHeader.get(1), Beverages);
				listItemChild.put(listItemHeader.get(2), Canned);
				listItemChild.put(listItemHeader.get(3), pet);
				listItemChild.put(listItemHeader.get(4), Vegetables);
				listItemChild.put(listItemHeader.get(5), Cleaning);
				listItemChild.put(listItemHeader.get(6), coming);
				
				Log.v("BALAKRISHNA","BALAKRISHNA");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	@Override
	public boolean onChildClick(ExpandableListView parent, View v,int groupPosition, int childPosition, long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
