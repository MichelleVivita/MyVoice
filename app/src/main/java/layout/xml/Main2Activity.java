package layout.xml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pranav.myvoice.MainActivity;
import com.example.pranav.myvoice.R;

public class Main2Activity extends AppCompatActivity {

    public void myfeelings(View view)
    {

        Intent il=new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(il);

    }

    public void iamhungry(View view)
    {

        Intent il=new Intent(Main2Activity.this,Main5Activity.class);
        startActivity(il);

    }

    public void myactivities(View view)
    {

        Intent il=new Intent(Main2Activity.this,Main6Activity.class);
        startActivity(il);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
