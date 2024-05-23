package com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sec extends Activity {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sec);
	    }
	 public void back(View view){
		 startActivity(new Intent(this,TestActivity.class));
		 }

}
