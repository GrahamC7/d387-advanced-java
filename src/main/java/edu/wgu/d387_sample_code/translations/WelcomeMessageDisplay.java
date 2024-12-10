package edu.wgu.d387_sample_code.translations;

import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessageDisplay implements Runnable{
    Locale locale;

    public WelcomeMessageDisplay(Locale locale) {
        this.locale = locale;
    }

    public String welcomeMessageGet() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run(){}
}
