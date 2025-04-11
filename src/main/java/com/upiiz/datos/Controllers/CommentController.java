package com.upiiz.datos.Controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CommentController {

    @GetMapping("/comments")
    public String comments(Model model) {
        return "listado-comentarios";
    }
    @GetMapping("/comments/product/{id}")
    public String product(Model model, @PathVariable int id) {
        return "listado-comentarios";
    }
}
