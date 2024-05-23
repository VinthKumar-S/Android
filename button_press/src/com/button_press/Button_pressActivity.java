package com.button_press;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class Button_pressActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
   
    Button button;
    EditText et1,et2;
    TextView t3;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         button=(Button)findViewById(R.id.b);
         et1=(EditText)findViewById(R.id.et);
         et2=(EditText)findViewById(R.id.et1);
         t3=(TextView)findViewById(R.id.t3);
        button.setOnClickListener(this);
        ActionBar ac=getActionBar();
        ac.hide();
    }
    public void onClick(View v)
    {
    	String in1=et1.getText().toString(),in2=et2.getText().toString();
    	t3.setText(in1+in2);    	
    }
}