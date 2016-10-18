package com.example.helloword;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btnPlay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//×¢²á²¥·Å°´Å¥¿Ø¼þ
		btnPlay=(Button) this.findViewById(R.id.btnPlay);
		//¼àÌý²¥·Å°´Å¥¿Ø¼þ
		btnPlay.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.xpg);
			mp.start();
				

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
