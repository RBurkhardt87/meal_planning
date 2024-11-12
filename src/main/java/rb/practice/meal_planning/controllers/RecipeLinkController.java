package rb.practice.meal_planning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("recipeLinks")
public class RecipeLinkController {

    @GetMapping
    public String displayRecipeLinksPage(Model model){
        model.addAttribute("tab", "Recipe Links");
        model.addAttribute("title", "Welcome to the Recipe Links");
        return "recipeLink/index";
    }
}
