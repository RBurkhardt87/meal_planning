package rb.practice.meal_planning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("stores")
public class StoreController {

    @GetMapping
    public String displayStoresPage(Model model){
        model.addAttribute("tab", "Stores");
        model.addAttribute("title", "Welcome to the Stores");
        return "store/index";
    }

}
