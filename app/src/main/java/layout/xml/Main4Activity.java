package layout.xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Toast;

import com.example.pranav.myvoice.R;


public class Main4Activity extends AppCompatActivity {

    public void happyaudio(View view) {
        Toast.makeText(this,"I feel Happy !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happyaudio);
        mediaPlayer.start();

    }
    public void sadaudio(View view) {
        Toast.makeText(this,"I feel Sad !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sadaudio);
        mediaPlayer.start();
    }
    public void lovedaudio(View view) {
        Toast.makeText(this,"I feel Loved !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.loved);
        mediaPlayer.start();
    }
    public void angryaudio(View view) {
        Toast.makeText(this,"I am Angry !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.angry);
        mediaPlayer.start();
    }
    public void sickaudio(View view) {
        Toast.makeText(this,"I feel Sick !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sick);
        mediaPlayer.start();
    }
    public void nervousaudio(View view) {
        Toast.makeText(this,"I feel Nervous !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.nervous);
        mediaPlayer.start();
    }
    public void excitedaudio(View view) {
        Toast.makeText(this,"I feel Excited !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.excited);
        mediaPlayer.start();
    }
    public void embarrasedaudio(View view) {
        Toast.makeText(this,"I feel Embarassed !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.embarassed);
        mediaPlayer.start();
    }
    public void shyaudio(View view) {
        Toast.makeText(this,"I am Shy !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.shy);
        mediaPlayer.start();
    }
    public void tiredaudio(View view) {
        Toast.makeText(this,"I feel Tired !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.tired);
        mediaPlayer.start();
    }
    public void afraidaudio(View view) {
        Toast.makeText(this,"I am Afraid !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.afraid);
        mediaPlayer.start();
    }
    public void ashamedaudio(View view) {
        Toast.makeText(this,"I feel Ashamed !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ashamed);
        mediaPlayer.start();
    }
    public void guiltyaudio(View view) {
        Toast.makeText(this,"I feel Guilty !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.guilty);
        mediaPlayer.start();
    }
    public void gratefulaudio(View view) {
        Toast.makeText(this,"I feel Grateful !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.grateful);
        mediaPlayer.start();
    }
    public void surprisedaudio(View view) {
        Toast.makeText(this,"I am Surprised !! " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.surprised);
        mediaPlayer.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    }

