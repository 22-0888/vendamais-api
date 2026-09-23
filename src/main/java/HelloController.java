package br.com.emalm.vendamais_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "VendaMais API no ar!";
    }

    @GetMapping("/")
    public String home() {
        return "API VendaMais funcionando!";
    }
}

