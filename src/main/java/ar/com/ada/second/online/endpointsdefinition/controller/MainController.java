package ar.com.ada.second.online.endpointsdefinition.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "main")
public class MainController {
    //DELETE, POST, GET, PUT/ PATCH => path (segmento de la url: localhost8080/{segment}

    @GetMapping({ "/sayHi","/",""})
        public ResponseEntity sayHelloWorld(){
            Map<String, String> responseBody = new HashMap<>();
            responseBody.put("Hello", "world");
            return ResponseEntity.ok().body(responseBody);
            //return ResponseEntity.ok(responseBody);
        }

        @PostMapping({})
    public ResponseEntity postItemMethod(){
        return null;
        }
}
