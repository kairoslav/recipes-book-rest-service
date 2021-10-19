package recipes;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Recipes {
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public int addRecipe(Recipe recipe) {
        recipes.add(recipe);
        return recipes.size() - 1;
    }
}
