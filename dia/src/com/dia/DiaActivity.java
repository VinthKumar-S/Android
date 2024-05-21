package com.dia;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class DiaActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void d(View v)
    {
    	AlertDialog.Builder b=new AlertDialog.Builder(DiaActivity.this);
    	b.setTitle("Warning");
    	AlertDialog ab= b.create();
    	ab.show();
    }

}