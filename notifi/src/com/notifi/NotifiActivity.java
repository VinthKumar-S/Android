package com.notifi;

import com.not.R;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;

public class NotifiActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void onClick(View v)
    {
    	action();
    }
    public void action()
    {
    	Notification n=new Notification(R.drawable.ic_launcher,"Meeting Started", System.currentTimeMillis());
    	CharSequence from="System Alarm";
    	CharSequence message="Meeting is Ready...";
    	n.setLatestEventInfo(this, from, message, pi);
    	n.vibrate=new long[]{100,250,100,500};
    }
}