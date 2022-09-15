package com.professorangoti.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("home")
    public String home() { // metodo para retornar o index quando a pagina for acessada
        return "home";
    }
}
