package com.dor.ahaha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class TopRatedFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_top_rated, container, false);
		GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(new HiraganaAdapter(rootView.getContext())); // uses the view to get the context instead of getActivity().
        gridView.setOnItemClickListener(new OnItemClickListener() {
    		@Override
    		public void onItemClick(AdapterView<?>parent, View v, int position, long id) {
    		//sending image id to fullscreen activity
    		Intent i = new Intent(getApplicationContext(),
    		FullImageActivity.class);
    		//passing array index
    		i.putExtra("id", position);
    		startActivity(i);
    		}

			private Context getApplicationContext() {
				// TODO Auto-generated method stub
				return null;
			}
    		});
		return rootView;
	}
}
