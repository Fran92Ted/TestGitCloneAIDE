package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.media.*;
import android.widget.Button;
import android.content.Intent;
import android.media.MediaPlayer;

public class MainActivity extends Activity 
{
	private MediaPlayer audio=new MediaPlayer();
	private static String traccia=null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		traccia=
		
    }
	public void plays(View v,int bpm)
	{new BackgroundTask.execute(bpm);}
	private class BackgroundTask extends AsyncTask<int,void,void>
	{

		@Override
		protected Object doInBackground(Object[] p1)
		{
			// TODO: Implement this method
			
			
			return null;
		}

		@Override
		protected void onProgressUpdate(Object[] values)
		{
			// TODO: Implement this method
			super.onProgressUpdate(values);
		}

		@Override
		protected void onPostExecute(Object result)
		{
			// TODO: Implement this method
			super.onPostExecute(result);
		}

		@Override
		protected void onPreExecute()
		{
			// TODO: Implement this method
			super.onPreExecute();
		}

		
	}
	
}
