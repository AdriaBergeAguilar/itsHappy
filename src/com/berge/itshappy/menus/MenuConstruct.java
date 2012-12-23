package com.berge.itshappy.menus;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.berge.itshappy.MainActivity;
import com.berge.itshappy.R;
import com.capricorn.ArcMenu;

public class MenuConstruct {
	private static final int[] ITEM_DRAWABLES = { R.drawable.composer_camera, R.drawable.composer_music,
		R.drawable.composer_place, R.drawable.composer_sleep, R.drawable.composer_thought, R.drawable.composer_with };

	public static void addMenu(Activity activity){
		ArcMenu arcMenu = (ArcMenu) activity.findViewById(R.id.arc_menu);

		final int itemCount = ITEM_DRAWABLES.length;
		for (int i = 0; i < itemCount; i++) {
			ImageView item = new ImageView(activity);
			item.setImageResource(ITEM_DRAWABLES[i]);

			arcMenu.addItem(item, new ListenerMenuCircle(activity));// Add a menu item
		}
	}
}
