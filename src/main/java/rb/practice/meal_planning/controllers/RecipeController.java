package rb.practice.meal_planning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recipes")
public class RecipeController {

    @GetMapping
    public String displayRecipesPage(Model model){
        model.addAttribute("tab", "Recipes");
        model.addAttribute("title", "Welcome to Your Recipes");
        return "recipe/index";
    }
}
