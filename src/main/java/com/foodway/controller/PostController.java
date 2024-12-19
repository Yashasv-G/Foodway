package com.foodway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import com.foodway.model.Post;

@Controller
public class PostController {

    // Display the recipe upload page
    @GetMapping("/upload")
    public String uploadPage() {
        return "upload"; // Points to upload.html template
    }

    // Handle the recipe upload form submission
    @PostMapping("/upload")
    public String uploadRecipe(@RequestParam String title, 
                               @RequestParam String description, 
                               @RequestParam String imageUrl, Model model) {
        // Here, you would save the recipe to a database or storage system
        Post newPost = new Post(title, description, imageUrl);
        
        // For now, just display the post data on the page
        model.addAttribute("post", newPost);
        
        // Redirect to a page where the new post is shown (can be a recipe detail page)
        return "recipeDetails"; // Points to recipeDetails.html template
    }
}
