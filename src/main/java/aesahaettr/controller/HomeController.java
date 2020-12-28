package aesahaettr.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/home")
public class HomeController {

    @GetMapping
    public Map<String, String> home() {
        return Collections.singletonMap("nom", "Sébastien");
    }

}
