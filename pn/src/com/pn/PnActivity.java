package com.pn;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PnActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    
    Button b1;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.b1);
       b1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        NotificationManager nm=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notify= new Notification(R.drawable.ic_launcher,"heloo",System.currentTimeMillis());
            
          Context con=PnActivity.this;
          Intent i=new Intent(con,PnActivity.class);
          PendingIntent pn=PendingIntent.getActivity(getApplicationContext(), 0, i,0);
          notify.setLatestEventInfo(con, "From the PC","You have More Storage", pn);
          nm.notify(0,notify);
    }
}