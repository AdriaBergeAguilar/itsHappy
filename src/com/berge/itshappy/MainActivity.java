package com.berge.itshappy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.berge.itshappy.menus.MenuConstruct;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MenuConstruct.addMenu(this,MenuConstruct.MENU_MAIN_ACTIVITY);//crea el menu circular!!       
        
        
        TextView nom = (TextView)findViewById(R.id.textView1);
        ApplicationItsHappy app = ((ApplicationItsHappy)getApplication());
       // nom.setText(app.user == null?"error":app.user.getFirstName());
	}
	
	

    
   
}
