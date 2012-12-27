package com.berge.itshappy.adapter;

import com.berge.itshappy.R;
import com.berge.itshappy.objetos.ItemLista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListasPropiasAdapter extends BaseAdapter {
	String[] NOMBRES_AMIGOS = new String[]{"Alverto","Fermin","Sancho","Marti","David"};
	String[] IMAGENES = new String[]{};
	private Context context;
	public ListasPropiasAdapter(Context listasAmigos) {
		this.context = listasAmigos;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return NOMBRES_AMIGOS.length;
	}

	@Override
	public Object getItem(int position) {
		ItemLista lista = new ItemLista();
		lista.NOMBRE = NOMBRES_AMIGOS[position];
		return lista;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		 View v = convertView;
		 ViewHolder holder = null;		 
		 if (convertView == null) {
			 
			 LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			 v = vi.inflate(R.layout.item_listas, null);
			 holder = new ViewHolder();
			 holder.imagen = (ImageView) v.findViewById(R.id.imgFoto);
			 holder.lista = (TextView) v.findViewById(R.id.txtNombreLista);
			 v.setTag(holder);
			 
		 }else{
			 holder = (ViewHolder)v.getTag();
		 }
		 
		 ItemLista item = (ItemLista)getItem(position);
		 holder.imagen.setAlpha(position);
		 holder.lista.setText(item.NOMBRE);	
			
		 return v;
	}

	
	private class ViewHolder{
		TextView lista;
		ImageView imagen;
	}
}