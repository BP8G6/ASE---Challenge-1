package com.example.estore;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentInfo extends Activity {
	
	private Button submit;
	private EditText Deladdress, Accno, PType, ExpDate, Amount; 
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.payment_info);
		
		submit =(Button)findViewById(R.id.btnpaysub);
	submit.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Deladdress=(EditText)findViewById(R.id.et_deliveryaddress); 
		Accno=(EditText)findViewById(R.id.et_accountno); 
		 ExpDate=(EditText)findViewById(R.id.et_expdate); 
		 Amount=(EditText)findViewById(R.id.et_amount); 
		 
		 if(Deladdress.equals("")||Accno.equals("")||ExpDate.equals("")||Amount.equals(""))
		 {
		 
			 Toast.makeText(getApplicationContext(), "Field Vaccant", Toast.LENGTH_LONG).show();	
		
		 }
		 else
		 {
			 Toast.makeText(getApplicationContext(), "Payment Success..! Please wait for 3 hours to process your request", Toast.LENGTH_LONG).show();	 
		 }
		 }
	});
}
}



