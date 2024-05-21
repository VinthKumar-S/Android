package com.invisible;


import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.view.View.*;
public class InvisibleActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	 Button b;
	    EditText e;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b=(Button)findViewById(R.id.b2);
        e=(EditText)findViewById(R.id.e1);
        b.setOnClickListener(this);
    }
    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String s1="Hello "+e.getText();
		Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
	}
}