package com.javacodegeeks.mediadobarulho;

import android.os.Bundle;

import com.javacodegeeks.nataldj.R;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MenuManager extends Activity
{
	   @Override
	    protected void onCreate(Bundle savedInstanceState) 
	   {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.menu);
	    }

	public void click_play(View view)
	{
		Intent intent = new Intent(this, Play.class);
    	startActivity(intent);
	}
	
	public void click_credits(View view)
	{
		Intent intent = new Intent(this, Credits.class);
    	startActivity(intent);
	}
}
