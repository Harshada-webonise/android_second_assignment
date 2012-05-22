package com.weboniselab.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class PersonDetails extends Activity implements OnClickListener
{
	 EditText nameEditText,adressEditText;
	 RadioButton maleRadioButton,femaleRadioButton;
	 ToggleButton maritalstatusToggleButton;
	 CheckBox playingCheckBox,readingCheckBox,singingCheckBox;
	 RatingBar ratinbar;
	 Button nextButton;
	 String name,adress,gender,maritalStatus,checkbox;
	 float rate;
	 
	
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.persondetails);
	     
	   nameEditText=(EditText) findViewById(R.id.nameEditText);
	   adressEditText=(EditText) findViewById(R.id.adressEditText);
	   maleRadioButton=(RadioButton) findViewById(R.id.radioMale);     
	   femaleRadioButton=(RadioButton) findViewById(R.id.radioFemale);
	   maritalstatusToggleButton=(ToggleButton) findViewById(R.id.togglebutton);
	   playingCheckBox=(CheckBox) findViewById(R.id.playingCheckbox);
	   readingCheckBox=(CheckBox) findViewById(R.id.readingCheckbox);
	   singingCheckBox=(CheckBox) findViewById(R.id.singingCheckbox);
	   ratinbar=(RatingBar) findViewById(R.id.ratingbar);
       nextButton=(Button) findViewById(R.id.btnNext);
       nextButton.setOnClickListener(this);
	   }


	@Override
	public void onClick(View v) 
	{
		name=nameEditText.getText().toString();
		Log.d("Name",name);
		adress=adressEditText.getText().toString();
		gender=maleRadioButton.isChecked()?"Male":"Female";
		maritalStatus=maritalstatusToggleButton.isChecked()?"married":"unmarried";

		
		StringBuffer result = new StringBuffer();
		int flag=0;
		if(playingCheckBox.isChecked())
		{	
		result.append("Playing");
		flag=1;
		}
	    if(readingCheckBox.isChecked())
	    {
	    	if(flag==1)
	    result.append(",");
		result.append("Reading");
		flag=1;
	    }
	    if(singingCheckBox.isChecked())
	    {
	    	if(flag==1)
	 	result.append(",");
		result.append("singing");
	    }
	
      rate=ratinbar.getRating();
		
      personInformation person=new personInformation(name,adress,gender,maritalStatus,result.toString(),rate);
      Intent intent=new Intent(PersonDetails.this,DisplayPersonDetails.class);
      intent.putExtra("PersonObject",person);
      startActivity(intent);
      }
	
	
	

}
