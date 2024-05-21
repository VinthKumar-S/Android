package com.log;


import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class LogActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
   Button b1,b2;
   EditText e1,e2;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e1);
        b2=(Button)findViewById(R.id.b2);
        e2=(EditText)findViewById(R.id.e2);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
    }
 
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String pass="",ck="world";
		if(v.getId()==R.id.b1)
		{
			pass=e2.getText()+"";
			
			if(ck.equals(pass))
			{
				Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
				
			}
			else
			{
				Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT).show();				
			}
		}
		else if(v.getId()==R.id.b2)
		{
			e2.setText("");
			e1.setText("");
		}
		
	}
}