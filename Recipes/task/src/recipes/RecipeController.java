package recipes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    private Recipe currentRecipe = new Recipe();

    @GetMapping("/api/recipe")
    public Recipe getRecipe() {
        return currentRecipe;
    }

    @PostMapping("/api/recipe")
    public void postRecipe(@RequestBody Recipe recipe) {
        currentRecipe = recipe;
    }
}
