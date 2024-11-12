package rb.practice.meal_planning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ingredients")
public class IngredientController {

    @GetMapping
    public String displayIngredientsPage(Model model){
        model.addAttribute("tab", "Ingredients");
        model.addAttribute("title", "Welcome to Your Ingredients");
        return "ingredient/index";
    }

}
