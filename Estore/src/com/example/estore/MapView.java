package com.example.estore;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;


	
public class MapView extends Activity {
	
	private double latitudeE51 = 39.034474;
	private double longitudeE51 =-94.580972;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.mapview);
		
		/*webView = (WebView)findViewById(R.id.webViewmap);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl();*/
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("geo:0,0?q=" + (latitudeE51+","+ longitudeE51)));
		
		
	}

}
