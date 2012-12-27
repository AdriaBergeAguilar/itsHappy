package com.berge.itshappy.menus;

import com.berge.itshappy.EditPerfil;
import com.berge.itshappy.LlistesActivity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ListenerMenuCircle implements OnClickListener{
	private Activity activity;
	private int posicion;
	public ListenerMenuCircle(Activity activity, int position){
		this.activity = activity;
		this.posicion = position;
	}
	@Override
	public void onClick(View v) {
		//String name = activity.getPackageName();
		Toast.makeText(activity,""+ posicion, Toast.LENGTH_LONG).show();
		Class<?> ir = null;
		
		switch (posicion) {
			case 0:
				ir = EditPerfil.class;
				break;
			case 1:
				ir = LlistesActivity.class;
				break;

			default:
				break;
		}
		
		if(ir != null){
			activity.startActivity(new Intent(activity,ir));
		}
	}

}
