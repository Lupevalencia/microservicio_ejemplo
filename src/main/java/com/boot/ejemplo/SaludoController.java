package com.boot.ejemplo;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class SaludoController {
    @GetMapping(value = "saludo", produces= MediaType.TEXT_PLAIN_VALUE) //Me da error al arrancar y no he podido ir al navegador y ver que se mostraba el mensaje, volver al punto 8/9
    public String saludo(){

        return "Microservicio Spring Boot";
    }

    @GetMapping(value = "saludo/{name}", produces =MediaType.TEXT_PLAIN_VALUE) //Se ejecutará este caso siempre que en la petición después del saludo aparezca el nombre de alguna variable
    public String saludo(@PathVariable("name") String n){   //para hacer la petición indicar la url CON EL PUERTO QUE NOS INDIQUE EL ARRANQUE DE LA APLICACIÓN
        return "Bienvenido Sr/a "+n;
    } //indicamos el nombre de la variable con @PathVariable
}

// A TRAVÉS DE LA LIBRERÍA JACKSON, SPRING MAPEA AUTOMÁTICAMENTE UN JAVABEAN A JSON Y VICEVERSA