package com.example.zombies;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import com.parse.*;

import android.os.Bundle;
import android.app.*;
import android.view.Menu;

public class Main extends MapActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    
	    Parse.initialize(this, "7WuNEiRpNQA9Hh296skBSfDjDT6zeiIaVouMG2ur", "pxYTUrq6usL2f2y2rqWedkncUfKVHeNIenChc77N"); 
	    
	    MapView mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	    
	    /*
	    ParseObject testObject = new ParseObject("TestObject");
	    testObject.put("foo", "bar");
	    testObject.saveInBackground();
	    */
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
