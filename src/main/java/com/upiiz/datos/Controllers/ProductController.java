package com.upiiz.datos.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProductController {

    @GetMapping("/products")
    public String index() {
        return "listado-productos";
    }
    @GetMapping("/products/new")
    public String newProduct() {
        return "agregar-producto";
    }
}
