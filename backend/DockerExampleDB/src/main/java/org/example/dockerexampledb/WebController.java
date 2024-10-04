package org.example.dockerexampledb;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class WebController {
    @GetMapping("/hello")
    public ResponseEntity<String> printHello(){
        return  new ResponseEntity<>("Hello3", HttpStatus.OK);
    }

}
