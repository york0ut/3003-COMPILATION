package com.javacodegeeks.mediadobarulho;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.javacodegeeks.nataldj.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressLint("NewApi")
public class Play extends Activity 
{
	MediaPlayer mp;
	Button myButton;
	final List<Integer> soundList = new ArrayList<Integer>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play);
		initializeViews();
	}
	
	public void initializeViews()
	{
		myButton = (Button)findViewById(R.id.button2);
		soundList.add(R.raw.calarabocaumbrela);
	    soundList.add(R.raw.carnemoidaplatonow);
	    soundList.add(R.raw.marciabotelhojao);
	    soundList.add(R.raw.ovoovoovonatal);
	    soundList.add(R.raw.paraumbrela);
	    soundList.add(R.raw.picadoaspirabatman);
	    soundList.add(R.raw.querumsucoana);
	    soundList.add(R.raw.reginaumbrela);
	    soundList.add(R.raw.tadesacanagemdavson);
	    soundList.add(R.raw.suamaesabebatman);
	    soundList.add(R.raw.vamoclafelcks);
	    soundList.add(R.raw.vaquinhapiruzinho);
	}

	public void play(View view) 
	{		
	    int randomInt = (new Random().nextInt(soundList.size()));
        int sound = soundList.get(randomInt);
        MediaPlayer mp = MediaPlayer.create(myButton.getContext(), sound);
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();

            };
        });
	}


	
	public void click_menuu(View view)
	{
		if (mp != null) 
		{
	        mp.stop();
	        mp.release();
	        mp = null;
		}
		Intent intent = new Intent(this, MenuManager.class);
    	startActivity(intent);
	}
}