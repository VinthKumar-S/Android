package com.arith;


import android.app.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class ArithActivity extends Activity  implements OnClickListener {
    /** Called when the activity is first created. */
    
    Button button,button2,button3;
    EditText et1,et2;
    TextView t3;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button=(Button)findViewById(R.id.b);
        button2=(Button)findViewById(R.id.b2);
        button3=(Button)findViewById(R.id.b3);
        et1=(EditText)findViewById(R.id.et);
        et2=(EditText)findViewById(R.id.et1);
        t3=(TextView)findViewById(R.id.t3);
       button.setOnClickListener(this);
       button2.setOnClickListener(this);
       button3.setOnClickListener(this);
    }
    public void onClick(View v)
    {
    	double a=0,b=0,c;
    	if(v.getId()==R.id.b)
    	{
       
    	a=Double.parseDouble(et1.getText()+"");
    	b=Double.parseDouble(et2.getText()+"");
    	c=a+b;
    	t3.setText("Addition:"+c);
    	}
    	else if(v.getId()==R.id.b2)
    	{
    	a=Double.parseDouble(et1.getText()+"");
    	b=Double.parseDouble(et2.getText()+"");
    	c=a-b;
    	t3.setText("Subtraction:"+c);
    	}
    	else if(v.getId()==R.id.b3)
    	{
    	a=Double.parseDouble(et1.getText()+"");
    	b=Double.parseDouble(et2.getText()+"");
    	c=a*b;
    	t3.setText("Mutiplication:"+c);
    	}
    	
    }
}