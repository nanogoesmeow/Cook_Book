import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;

public class RecipeCollections implements Serializable {

    // Might have to go with RecipeCollection objects
    Set<Recipe> recipes = new HashSet<>();
    public void newRecipeCollection(String baseUrl) throws IOException {

        Set<String> recipeLinks = new WebsiteParser().parseBaseUrl(baseUrl);

        for(String recipeUrl : recipeLinks) {

            Recipe recipe = new Recipe(baseUrl, recipeUrl);
            recipes.add(recipe);

        }


        for (Recipe recipe : recipes) {
            System.out.println(recipe.getBaseUrl());
            System.out.println(recipe.getRecipeUrl());

        }







    }

    private void addRecipeCollection(Set<Recipe> recipes) {

        // FileOutputStream fos = new FileOutputStream(master)

    }
}
