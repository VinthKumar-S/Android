package com.arith;


import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.view.View.*;
public class ArithActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    Button b,b2,b3;
    EditText e1,e2;
    TextView t;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b=(Button)findViewById(R.id.b);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        t=(TextView)findViewById(R.id.t3);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }
    public void onClick(View v) {
		// TODO Auto-generated method stub
    	double a=0,b=0,c=0;
    	
	 if(v.getId()==R.id.b)
		{
		 a=Double.parseDouble(e1.getText()+"");
			b=Double.parseDouble(e2.getText()+"");
			c=a+b;
			t.setText("Addition:"+c);
		}
		else if(v.getId()==R.id.b2)
		{
			a=Double.parseDouble(e1.getText()+"");
			b=Double.parseDouble(e2.getText()+"");
			c=a-b;
			t.setText("Subtraction:"+c);
		}
		else if(v.getId()==R.id.b3)
		{
			a=Double.parseDouble(e1.getText()+"");
			b=Double.parseDouble(e2.getText()+"");
			c=a*b;
			t.setText("Multiplication:"+c);
		}
	}
}