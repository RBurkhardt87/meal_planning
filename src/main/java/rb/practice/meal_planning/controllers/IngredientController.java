package rb.practice.meal_planning.controllers;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rb.practice.meal_planning.data.IngredientData;
import rb.practice.meal_planning.data.StoreData;
import rb.practice.meal_planning.models.Ingredient;

@Controller
@RequestMapping("ingredients")
public class IngredientController {

    @GetMapping
    public String displayIngredientsPage(Model model){
        model.addAttribute("tab", "Ingredients");
        model.addAttribute("title", "Welcome to Your Ingredients");
        model.addAttribute("ingredients", IngredientData.getAll());
        return "ingredient/index";
    }

    @GetMapping("/add")
    public String renderAddIngredientForm(Model model) {
        model.addAttribute("title", "Add an Ingredient");
        model.addAttribute(new Ingredient());
        model.addAttribute("stores", StoreData.getAll());
        return "ingredient/add";
    }

    @PostMapping("/add")
    public String processAddIngredientForm(@Valid @ModelAttribute Ingredient ingredient,
                                                 Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add an Ingredient");
            model.addAttribute(new Ingredient());
            return "ingredient/add";
        }

        IngredientData.add(ingredient);
        return "redirect:/ingredients";
    }



}
