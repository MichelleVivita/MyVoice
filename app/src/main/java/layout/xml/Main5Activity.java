package layout.xml;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pranav.myvoice.R;

public class Main5Activity extends AppCompatActivity {

    public void biscuitsaudio(View view) {
        Toast.makeText(this,"Can I have a biscuit? " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.biscuitsaudio);
        mediaPlayer.start();
    }
    public void fruitsaudio(View view) {
        Toast.makeText(this,"Can I have a fruit? " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.fruitsaudio);
        mediaPlayer.start();
    }
    public void eggsaudio(View view) {
        Toast.makeText(this,"I want an egg " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.eggsaudio);
        mediaPlayer.start();
    }
    public void juiceaudio(View view) {
        Toast.makeText(this,"I want some juice " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.juiceaudio);
        mediaPlayer.start();
    }
    public void pizzaaudio(View view) {
        Toast.makeText(this,"I want pizza " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.pizzaaudio);
        mediaPlayer.start();
    }
    public void icecreamaudio(View view) {
        Toast.makeText(this,"I want icecream" , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.icecreamaudio);
        mediaPlayer.start();
    }
    public void chickenaudio(View view) {
        Toast.makeText(this,"I want chicken " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.chickenaudio);
        mediaPlayer.start();
    }
    public void wateraudio(View view) {
        Toast.makeText(this,"I want some water " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.wateraudio);
        mediaPlayer.start();
    }
    public void chocaudio(View view) {
        Toast.makeText(this,"I want cake " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.chocolate);
        mediaPlayer.start();
    }
    public void soupaudio(View view) {
        Toast.makeText(this,"I want some dry fruits" , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.soup);
        mediaPlayer.start();
    }
    public void cheeseaudio(View view) {
        Toast.makeText(this,"Could I have some cheese? " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.cheese);
        mediaPlayer.start();
    }
    public void driedfruitsaudio(View view) {
        Toast.makeText(this,"I want some dried fruits" , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.driedfruits);
        mediaPlayer.start();
    }
    public void milkaudio(View view) {
        Toast.makeText(this,"Give me some milk " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.milk);
        mediaPlayer.start();
    }
    public void cakeaudio(View view) {
        Toast.makeText(this,"I want cake " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.cake);
        mediaPlayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}
