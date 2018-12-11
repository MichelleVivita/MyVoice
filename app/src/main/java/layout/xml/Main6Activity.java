package layout.xml;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pranav.myvoice.R;

public class Main6Activity extends AppCompatActivity {

    public void brushaudio(View view) {
        Toast.makeText(this,"I want to brush my teeth " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.brushaudio);
        mediaPlayer.start();
    }
    public void exerciseaudio(View view) {
        Toast.makeText(this,"I want to exercise " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.exerciseaudio);
        mediaPlayer.start();
    }
    public void danceaudio(View view) {
        Toast.makeText(this,"I want to dance " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.danceaudio);
        mediaPlayer.start();
    }
    public void batheaudio(View view) {
        Toast.makeText(this,"I want to bathe " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.batheaudio);
        mediaPlayer.start();
    }
    public void paintaudio(View view) {
        Toast.makeText(this,"I want to paint pictures " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.paintaudio);
        mediaPlayer.start();
    }
    public void readaudio(View view) {
        Toast.makeText(this,"I want to read " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.readaudio);
        mediaPlayer.start();
    }
    public void sleepaudio(View view) {
        Toast.makeText(this,"I am sleepy " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sleepaudio);
        mediaPlayer.start();
    }
    public void toilet(View view) {
        Toast.makeText(this,"I want to use the restroom " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.toilet);
        mediaPlayer.start();
    }
    public void sing(View view) {
        Toast.makeText(this,"I want to sing " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sing);
        mediaPlayer.start();
    }
    public void shop(View view) {
        Toast.makeText(this,"I want to go shopping " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.shop);
        mediaPlayer.start();
    }
    public void video(View view) {
        Toast.makeText(this,"I want to play a video game " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.video);
        mediaPlayer.start();
    }
    public void play(View view) {
        Toast.makeText(this,"I want to play " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.play);
        mediaPlayer.start();
    }
    public void study(View view) {
        Toast.makeText(this,"I have to study " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.study);
        mediaPlayer.start();
    }
    public void tv(View view) {
        Toast.makeText(this,"I want to watch TV " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.tv);
                mediaPlayer.start();
    }
    public void walk(View view) {
        Toast.makeText(this,"I want to walk the dog " , Toast.LENGTH_LONG).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.walk);
        mediaPlayer.start();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
}
