package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translations.WelcomeMessageDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(D387SampleCodeApplication.class, args);


        // english message
        WelcomeMessageDisplay displayWelcomeMessageEnglish = new WelcomeMessageDisplay(Locale.US);
        Thread englishMessage = new Thread(displayWelcomeMessageEnglish);
        englishMessage.start();

        // french message
        WelcomeMessageDisplay displayWelcomeMessageFrench = new WelcomeMessageDisplay(Locale.CANADA_FRENCH);
        Thread frenchMessage = new Thread(displayWelcomeMessageFrench);
        frenchMessage.start();
    }
}


