package com.anthonyfrandsen.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class PortfolioController {

    private int pageCount = 0;

    @GetMapping("/")
    public String index(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("pageCount", ++pageCount);
        model.addAttribute("time", LocalDateTime.now().toLocalTime());
        return "index";
    }
}
