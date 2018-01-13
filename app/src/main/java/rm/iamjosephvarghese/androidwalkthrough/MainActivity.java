package rm.iamjosephvarghese.androidwalkthrough;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MainActivity extends AppIntro {


//    TODO: more stuff to be done...this is just a basic usage of the library

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            Intent walkThrough = new Intent(MainActivity.this,IntroActivity.class);
            startActivity(walkThrough);
            finish();





    }
}
