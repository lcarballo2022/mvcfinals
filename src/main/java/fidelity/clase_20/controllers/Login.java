package fidelity.clase_20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
    
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", "user");
        return "/login";
    }

    @PostMapping("/login")
    public String loginReal() {
        //procesamiento de login
        return "/login";
    }
}
