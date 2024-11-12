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
import rb.practice.meal_planning.models.Store;

@Controller
@RequestMapping("stores")
public class StoreController {

    @GetMapping
    public String displayStoresPage(Model model){
        model.addAttribute("tab", "Stores");
        model.addAttribute("title", "Welcome to the Stores");
        model.addAttribute("stores", StoreData.getAll());
        return "store/index";
    }

    @GetMapping("/add")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Add a Store to Shop");
        model.addAttribute(new Store());
        return "store/add";
    }

    @PostMapping("/add")
    public String processAddIngredientForm(@Valid @ModelAttribute Store store,
                                           Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add a Store to Shop");
            model.addAttribute(new Store());
            return "store/add";
        }

        StoreData.add(store);
        return "redirect:/stores";
    }
}
