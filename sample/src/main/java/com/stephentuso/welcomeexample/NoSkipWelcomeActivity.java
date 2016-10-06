package com.stephentuso.welcomeexample;

import com.stephentuso.welcome.WelcomeScreenBuilder;
import com.stephentuso.welcome.ui.WelcomeActivity;
import com.stephentuso.welcome.util.WelcomeScreenConfiguration;

/**
 * Created by stephentuso on 10/5/16.
 */

public class NoSkipWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeScreenConfiguration configuration() {
        return new WelcomeScreenBuilder(this)
                .theme(R.style.GeneralWelcomeScreenTheme)
                .defaultTitleTypefacePath("Roboto-Bold.ttf")
                .defaultHeaderTypefacePath("Roboto-Bold.ttf")
                .defaultBackgroundColor(R.color.red_background)
                .basicPage(R.drawable.photo, "No skip", "canSkip(false) was called on the builder")
                .basicPage(R.drawable.ic_back_white, "Back behaviour", "Pressing back on the first page will finish this with RESULT_CANCELED")
                .basicPage(R.drawable.ic_check_white, "Completion", "RESULT_OK will only be returned after navigating all the way to the end")
                .canSkip(false)
                .swipeToDismiss(true)
                .build();
    }

}
