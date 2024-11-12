package rb.practice.meal_planning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String displayHomePage(Model model){
        model.addAttribute("tab", "Meal Planning");
        model.addAttribute("title", "Welcome to Meal Planning");
        return "index";
    }


}
