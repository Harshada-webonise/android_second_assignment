package com.weboniselab.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayPersonDetails extends Activity 
{
	
	TextView nameTextView,addressTextView,genderTextView,maritalTextView,ratingTextView,hobbyTextView;
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	   setContentView(R.layout.displaypersondetails);
	   
	   nameTextView=(TextView) findViewById(R.id.namevalue);
       addressTextView=(TextView) findViewById(R.id.addressvalue);
       genderTextView=(TextView) findViewById(R.id.genderValue);
       maritalTextView=(TextView) findViewById(R.id.maritalStatusValue);
       ratingTextView=(TextView) findViewById(R.id.ratingValue);
       hobbyTextView=(TextView) findViewById(R.id.hobbyValue);
       
	   
	   personInformation person=getIntent().getParcelableExtra("PersonObject");
	
	  
	    nameTextView.setText(person.getName());
	    addressTextView.setText(person.getAddress());
	    genderTextView.setText(person.getGender());
	    maritalTextView.setText(person.getMaritalstatus());
	    hobbyTextView.setText(person.getHobbies());
	    
	    
	    ratingTextView.setText(Integer.toString((int)person.getRating()));
	    
	    
	    
	 
	 }
	

}
