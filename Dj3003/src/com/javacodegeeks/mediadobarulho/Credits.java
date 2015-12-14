package com.javacodegeeks.mediadobarulho;

import com.javacodegeeks.nataldj.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Credits extends Activity
{
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.credits);
	    }
	   
		public void click_menu(View view)
		{
			Intent intent = new Intent(this, MenuManager.class);
	    	startActivity(intent);
		}
}
