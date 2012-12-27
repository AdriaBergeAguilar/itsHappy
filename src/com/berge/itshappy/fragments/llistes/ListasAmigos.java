package com.berge.itshappy.fragments.llistes;

import com.berge.itshappy.R;
import com.berge.itshappy.adapter.ListasAmigosAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class ListasAmigos extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_llistes, container, false);

	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Activity parent = getActivity();
		
		TextView title = (TextView)parent.findViewById(R.id.txtTitle);
		String text = getResources().getString(R.string.listAmigos);
		title.setText(text+ "   amigos");
		
		ListView list = (ListView)parent.findViewById(R.id.listLlistes);
		ListasAmigosAdapter adapter = new ListasAmigosAdapter(this.getActivity());
		list.setAdapter(adapter);					
	}
}
