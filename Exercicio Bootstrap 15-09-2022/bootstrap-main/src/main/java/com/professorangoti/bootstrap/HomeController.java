package com.professorangoti.bootstrap;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.micrometer.core.instrument.util.IOUtils;

@Controller
public class HomeController {
    @GetMapping("home")
    public String home() { // metodo para retornar o index quando a pagina for acessada
        return "home";
    }
}
