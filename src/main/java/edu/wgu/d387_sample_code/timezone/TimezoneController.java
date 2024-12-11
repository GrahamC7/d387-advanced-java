package edu.wgu.d387_sample_code.timezone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class TimezoneController {
    @GetMapping("/presentationTime")
    public ResponseEntity<String> presentationTime(){
        String time = "Online Live Presentation Time: " + TimeConversion.getTime();
        return new ResponseEntity<String>(time, HttpStatus.OK);
    }
}
