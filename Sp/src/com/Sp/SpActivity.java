package com.Sp;



import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SpActivity extends Activity {
    /** Called when the activity is first created. */

	EditText name,age;
	String up="USER_PREF",n="KEY_NAME";
	SharedPreferences sp;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        name=(EditText)findViewById(R.id.et);
        sp=getSharedPreferences(up,Context.MODE_PRIVATE);
      
    }
    
    public void c(View v)
    {
    	name.setText("");
    }
    public void s(View v)
    {
    	String s1=name.getText()+"";
    	SharedPreferences.Editor se=sp.edit();
    	se.putString(n,s1);
    	se.commit();
    }
    public void sh(View v)
    {
    	StringBuilder sb=new StringBuilder();
    	if(sp.contains(n))
    	{
    		name.setText(sp.getString(n,""));
    	}
    }
}
