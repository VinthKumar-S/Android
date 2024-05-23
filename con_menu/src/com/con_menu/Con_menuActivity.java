package com.con_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Con_menuActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b=(Button)findViewById(R.id.b1);
        b.setOnCreateContextMenuListener(this);
    }

   public void onCreateContextMenu(ContextMenu menu,View view,ContextMenuInfo info)
   {
	 super.onCreateContextMenu(menu, view, info);
	 CreateMenu(menu);
   }
    private void CreateMenu(Menu menu)
    {
    	menu.setQwertyMode(true);
    	
    	menu.add(0,0,0,"item 1");
    	menu.add(0,1,1,"item 2");
    	menu.add(0,2,2,"item 3");
    	MenuItem m1=menu.add(0,4,4,"item 4");
    	{
    		m1.setAlphabeticShortcut('a');
    	}
    }
}