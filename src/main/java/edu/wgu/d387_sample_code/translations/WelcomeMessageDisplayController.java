package edu.wgu.d387_sample_code.translations;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class WelcomeMessageDisplayController {

    @GetMapping("/welcome")
    public ResponseEntity<String> displayWelcome (@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        WelcomeMessageDisplay display = new WelcomeMessageDisplay(locale);

        return new ResponseEntity<String>( display.welcomeMessageGet(), HttpStatus.OK);
    }
}
