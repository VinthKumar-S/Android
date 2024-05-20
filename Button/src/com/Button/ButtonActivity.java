package com.Button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class ButtonActivity extends Activity {
    /** Called when the activity is first created. */
    
    Button mb;
    TextView tv;
    EditText et;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mb.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
			}
		});
    }
}