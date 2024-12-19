package com.foodway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @GetMapping("/upload")
    public String showUploadPage() {
        return "upload";  // Show upload page
    }

    @PostMapping("/upload")
    public String uploadRecipe(@RequestParam String title, 
                               @RequestParam String description, 
                               @RequestParam String imageUrl, Model model) {
        // Create new post object and add it to the model
        Post post = new Post(title, description, imageUrl); 
        model.addAttribute("post", post);
        return "recipeDetails";  // Show recipe details
    }
}
