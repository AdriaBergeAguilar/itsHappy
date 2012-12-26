package com.berge.itshappy.fragments;

import com.berge.itshappy.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DadesPersonalsOtros extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_dades_personals_otros, container, false);

	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		TextView TxtCodigo = (TextView)getActivity().findViewById(R.id.txtCodigo);
		TxtCodigo.setVisibility(View.GONE);
		TextView TxtCuenta = (TextView)getActivity().findViewById(R.id.txtCuenta);
		TxtCuenta.setVisibility(View.GONE);
	}
}
