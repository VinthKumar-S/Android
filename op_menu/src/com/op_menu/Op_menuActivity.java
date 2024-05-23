package com.op_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class Op_menuActivity extends Activity {
    /** Called when the activity is first created. */
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	super.onCreateOptionsMenu(menu);
    	CreateMenu(menu);
    	return true;
    }
   
    private void CreateMenu(Menu menu)
    {
    	menu.add(0,0,0,"item 1");
    	menu.add(0,1,1,"item 2");
    	menu.add(0,2,2,"item 3");
    }
  
}