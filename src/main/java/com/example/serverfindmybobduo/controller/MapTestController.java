package com.example.serverfindmybobduo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapTestController {
    @GetMapping("/map")
    public String main(Model model) {
        return "map";
    }
}