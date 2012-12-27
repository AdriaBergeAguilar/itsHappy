package com.berge.itshappy.menus;

import android.app.Activity;
import android.widget.ImageView;
import com.berge.itshappy.R;
import com.capricorn.ArcMenu;

public class MenuConstruct {
	public static final int[] MENU_MAIN_ACTIVITY = { R.drawable.composer_camera, R.drawable.composer_music,
		R.drawable.composer_place, R.drawable.composer_sleep, R.drawable.composer_thought, R.drawable.composer_with };

	public static final int[] MENU_EDIT_PERFIL = { R.drawable.composer_camera, R.drawable.composer_music,
		R.drawable.composer_place, R.drawable.composer_sleep, R.drawable.composer_thought, R.drawable.composer_with };

	public static void addMenu(Activity activity,int[] imagenes){
		ArcMenu arcMenu = (ArcMenu) activity.findViewById(R.id.arc_menu);

		final int itemCount = imagenes.length;
		for (int i = 0; i < itemCount; i++) {
			ImageView item = new ImageView(activity);
			item.setImageResource(imagenes[i]);

			arcMenu.addItem(item, new ListenerMenuCircle(activity,i));// Add a menu item
		}
	}
}
