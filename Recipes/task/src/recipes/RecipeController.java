package recipes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RecipeController {
    @Autowired
    private Recipes recipes;

    @GetMapping("/api/recipe/{id}")
    public ResponseEntity<?> getRecipe(@PathVariable int id) {
        if (recipes.getRecipes().size() < id || id < 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(recipes.getRecipes().get(id), HttpStatus.OK);
        }
    }

    @PostMapping("/api/recipe/new")
    public ResponseEntity<?> postRecipe(@RequestBody Recipe recipe) {
        int id = recipes.addRecipe(recipe);
        return new ResponseEntity<>(Map.of("id", id), HttpStatus.OK);
    }
}
