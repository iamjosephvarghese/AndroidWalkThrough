package rm.iamjosephvarghese.androidwalkthrough;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class IntroActivity extends AppIntro {

//    TODO:   https://github.com/apl-devs/AppIntro

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        We are not using set content view

        addSlide(AppIntroFragment.newInstance("title 1","description 1", R.drawable.ic_arrow_back_white,getResources().getColor(R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("title 2","description 2", R.drawable.ic_done_white,getResources().getColor(R.color.colorPrimaryDark)));


        showSkipButton(false);

        setZoomAnimation();


    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        //to go back to MainActivity...which is not finished!!!
        Intent done = new Intent(this,Done.class);
        startActivity(done);

    }

}
