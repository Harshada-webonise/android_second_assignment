package com.weboniselab.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener
{
    /** Called when the activity is first created. */
    EditText nameEditText;
    EditText passwordEditText;
    Button btnSave;
    
    
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        nameEditText=(EditText)findViewById(R.id.nameEditText);
        passwordEditText=(EditText)findViewById(R.id.passwordEditText);
        btnSave=(Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        
    }



	@Override
	public void onClick(View v)
	{
		
		
	    if((nameEditText.getText().toString().equalsIgnoreCase("aaa")) && (passwordEditText.getText().toString().equalsIgnoreCase("aaa")))
	    {
	   
	    	 Toast.makeText(LoginActivity.this, "SucessFul Login", Toast.LENGTH_SHORT).show();
	    	 Intent intent=new Intent(LoginActivity.this,PersonDetails.class);
		     startActivity(intent);
	    }
	    else
	    {
	    	
	    	 Toast.makeText(LoginActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
	    }
		
	}
}