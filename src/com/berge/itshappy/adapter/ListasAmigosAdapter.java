package com.berge.itshappy.adapter;

import com.berge.itshappy.R;
import com.berge.itshappy.objetos.ItemAmigo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListasAmigosAdapter extends BaseAdapter {
	String[] NOMBRES_AMIGOS = new String[]{"Alverto","Fermin","Sancho","Marti","David"};
	String[] NOMBRES_LISTAS = new String[]{"Reies","Cumple 18","Boda","cesta bebe","fiesta final de carrera"};
	String[] IMAGENES = new String[]{};
	private Context context;
	public ListasAmigosAdapter(Context listasAmigos) {
		this.context = listasAmigos;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return NOMBRES_AMIGOS.length;
	}

	@Override
	public Object getItem(int position) {
		ItemAmigo amigo = new ItemAmigo();
		amigo.NOMBRE = NOMBRES_AMIGOS[position];
		amigo.LISTA = NOMBRES_LISTAS[position];
		return amigo;
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
			 v = vi.inflate(R.layout.item_list_amigo, null);
			 holder = new ViewHolder();
			 holder.imagen = (ImageView) v.findViewById(R.id.imgFoto);
			 holder.amigo = (TextView) v.findViewById(R.id.txtNombreAmigo);
			 holder.lista = (TextView) v.findViewById(R.id.txtNombreLista);
			 v.setTag(holder);
			 
		 }else{
			 holder = (ViewHolder)v.getTag();
		 }
		 
		 ItemAmigo item = (ItemAmigo)getItem(position);
		 holder.imagen.setAlpha(position);
		 holder.amigo.setText(item.NOMBRE);
		 holder.lista.setText(item.LISTA);	
			
		 return v;
	}

	
	private class ViewHolder{
		TextView amigo;
		TextView lista;
		ImageView imagen;
	}
}
