package com.app_access;
import android.app.Activity;
import android.content.*;
import android.net.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.os.Bundle;

public class App_accessActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button b1,b2;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.c);
        b2=(Button)findViewById(R.id.d);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.d)
		{
		 Intent i1=new Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:+642624060"));
		 startActivity(i1);
		}
		else
		{
		 Intent i2=new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://amazon.com"));
		 startActivity(i2);
		}
	}
}