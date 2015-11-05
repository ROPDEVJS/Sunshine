package com.farbeninteractive.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment
{

	public MainActivityFragment()
	{
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);

		String[] forecastArray = {
			"Today - Sunny - 88/63",
			"Tomorrow - Fog - 70/40",
			"Weds - Cloudy - 72/63",
			"Thurs - Asteroids - 75/65",
			"Fri - Heavy Rain - 65/56",
			"Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
			"Sun - Sunny - 80/68",

			"Mon - Cloudy - 80/68",
			"Tue - Rainny - 80/68",
			"Wed - Foggy - 80/68",
			"Thu - Icy - 80/68",
			"Fri - Warm - 80/68",
			"Sat - Cold - 80/68",
			"Sun - Sunny - 80/68",

		};

		List<String> weekforecast = new ArrayList<String>( Arrays.asList(forecastArray) );

		ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
			getActivity(),
			R.layout.list_item_forecast,
			R.id.list_item_forecast_text,
			weekforecast
		);

		ListView listView = (ListView) rootView.findViewById( R.id.listview_forecast );
		listView.setAdapter( mForecastAdapter );

		return rootView;
	}
}
