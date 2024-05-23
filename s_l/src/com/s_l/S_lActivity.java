package com.s_l;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class S_lActivity extends Activity {
    /** Called when the activity is first created. */
   
	EditText name,age;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        name=(EditText)findViewById(R.id.et);
        age=(EditText)findViewById(R.id.et1);
    }
    protected void onResume()
    {
    	super.onResume();
    	SharedPreferences sh=getSharedPreferences("MySharedPref",MODE_PRIVATE);
    	String s1=sh.getString("name","");
    	int a=sh.getInt("age",0);
    	name.setText(s1);
    	age.setText(a+"");
    }
    protected void onPause()
    {
    	super.onPause();
    	SharedPreferences Sh=getSharedPreferences("MySharedPref",MODE_PRIVATE);
    	SharedPreferences.Editor me=Sh.edit();
    	me.putString("name",name.getText().toString());
    	me.putInt("age",Integer.parseInt(age.getText().toString()));
    	me.apply();
    }
}