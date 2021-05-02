package com.umanizales.apipaseoperros.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/paseoperros")
@Validated
public class PaseoPerrosController {
    @GetMapping
    public String getMessage(){
        return "Hola Campeones";
    }
    @GetMapping(path = "mensage2")
    public String getMessage2(){
        return "Hola campeones 2";
    }
    @GetMapping(path = "/mensage/{saludo}")
    public String getMessage3(@PathVariable("saludo") String saludo){
        return "hola" + saludo;
    }
    @GetMapping(path = "/mensage/{saludo}/{saludo2}")
    public String getMessage4(@PathVariable("saludo") String saludo,
                              @PathVariable("saludo2") String saludo2){
        return  saludo + saludo2;
    }
}