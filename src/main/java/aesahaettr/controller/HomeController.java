package aesahaettr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aesahaettr.services.IGreetingsServices;
import aesahaettr.ui.bean.GreetingsDto;

@RestController
@RequestMapping("api/home")
public class HomeController {

    @Autowired
    private IGreetingsServices greetingsServices;

    @GetMapping
    public GreetingsDto home() {
        return this.greetingsServices.getGreetings();
    }

}
