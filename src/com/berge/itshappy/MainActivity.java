package com.berge.itshappy;

import com.berge.itshappy.menus.MenuConstruct;
import com.capricorn.ArcMenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MenuConstruct.addMenu(this);
		/****/
	/** Called when the activity is first created. */
	

		

	}

}
