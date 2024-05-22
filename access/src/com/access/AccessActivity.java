package com.access;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;
import android.view.View.*;
import android.net.*;

public class AccessActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    Button c,d;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
    }


	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.d){
			Intent i1=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.amazon.com"));
			startActivity(i1);
		}
	
		if(v.getId()==R.id.c){
			Intent i2=new Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+1233333"));
			startActivity(i2);
		}
	
	}


}