package com.upiiz.datos.Controllers;

import org.springframework.ui.Model;
import com.upiiz.datos.Models.ProductModel;
import com.upiiz.datos.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products(Model model) {
        List<ProductModel> productos = productService.findAll();
        model.addAttribute("productos", productos);
        return "listado-productos";
    }

    @GetMapping("/products/new")
    public String newProduct(Model model) {
        ProductModel producto = new ProductModel();
        model.addAttribute("producto", producto);
        return "agregar-productos";
    }
    @PostMapping("/products/guardar")
    public String guardarProducto(ProductModel producto) {
        productService.save(producto);
        return "redirect:/products";
    }
}