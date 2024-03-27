package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MS2Controller {
    @GetMapping("/ms2")
    public String hello() {
        String instructions = "<div style=\"background-color: #e6e6e6; padding: 20px;\">" +
                "<h2 style=\"color: blue;\">Instructions:</h2>" +
                "<ul style=\"list-style-type: none; padding-left: 0;\">" +
                "<li style=\"color: red;\"><strong>Create:</strong> Click on the \"New\" button to create a new item.</li>" +
                "<li style=\"color: red;\"><strong>Read:</strong> View the list of existing items on the main page.</li>" +
                "<li style=\"color: red;\"><strong>Update:</strong> Click on an item to edit its details.</li>" +
                "<li style=\"color: red;\"><strong>Delete:</strong> Click on the \"Delete\" button next to an item to remove it.</li>" +
                "</ul>" +
                "<p style=\"color: blue;\">For login, <a href=\"http://localhost:8080/login\" style=\"color: blue;\">click here</a>.</p>" +
                "</div>";
        return instructions;
    }
}