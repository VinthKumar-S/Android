package com.link_act;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.*;
public class Link_actActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void onClick(View view)
    {
    	startActivity(new Intent("com.link_act.Act"));
    }
}