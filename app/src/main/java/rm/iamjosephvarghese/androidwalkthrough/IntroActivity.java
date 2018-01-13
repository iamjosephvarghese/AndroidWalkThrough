package rm.iamjosephvarghese.androidwalkthrough;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        We are not using set content view

        addSlide(AppIntroFragment.newInstance("title","description", R.drawable.ic_arrow_back_white,getResources().getColor(R.color.colorAccent)));
    }
}
