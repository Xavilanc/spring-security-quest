package com.wsc.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!!!";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "Amsterdam, Barcelone, Berlin, Biarritz, Bordeaux, La Loupe (oui c'est une ville), Lille, Lisbonne, Lyon, Madrid, Marseille, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours ";
    }
}
