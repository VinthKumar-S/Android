package com.sh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class ShActivity extends Activity {
    /** Called when the activity is first created. */
    
	EditText name;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        name=(EditText)findViewById(R.id.et);
    }
     protected void onResume()
    {
    	super.onResume();
    	SharedPreferences sh=getSharedPreferences("MySharedPref",MODE_PRIVATE);
    	String s1=sh.getString("name","");
    	name.setText(s1);
    	
    }
    protected void onPause()
    {
    	super.onPause();
    	SharedPreferences Sh=getSharedPreferences("MySharedPref",MODE_PRIVATE);
    	SharedPreferences.Editor me=Sh.edit();
    	me.putString("name",name.getText().toString());
    	me.apply();
    }
}