package com.berge.itshappy.menus;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ListenerMenuCircle implements OnClickListener{
	private Activity activity;
	public ListenerMenuCircle(Activity activity){
		this.activity = activity;
	}
	@Override
	public void onClick(View v) {
		String name = activity.getPackageName();
		Toast.makeText(activity, name, Toast.LENGTH_LONG).show();
		
	}

}
