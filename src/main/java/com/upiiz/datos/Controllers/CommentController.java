package com.upiiz.datos.Controllers;

import ch.qos.logback.core.model.Model;
import com.upiiz.datos.Models.CommentModel;
import com.upiiz.datos.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public String comments(Model model) {
        return "listado-comentarios";
    }
    @GetMapping("/comments/product/{id}")
    public String product(Model model, @PathVariable int id) {
        List<CommentModel> commentModels = commentService.findCommentsProductByid(id);
        model.addAttribute("comentarios", commentModels);
        return "listado-comentarios";
    }
}
