package com.toast;


import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ToastActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	 Button B;
	    EditText e;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        B=(Button)findViewById(R.id.B);
        e=(EditText)findViewById(R.id.e);
        B.setOnClickListener((OnClickListener) this);
    }
    public void onClick(View v)
    {
    	String s1=e.getText()+"";
        Toast.makeText(getApplicationContext(),"Hello "+s1,Toast.LENGTH_SHORT).show();

    }
}