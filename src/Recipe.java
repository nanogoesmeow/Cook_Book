import java.util.List;

public class Recipe {

    private String baseUrl;
    private String recipeUrl;
    private List<String> ingredientsList;

    public Recipe() {

        baseUrl = null;
        recipeUrl = null;
        ingredientsList = null;

    }

    public Recipe(String baseUrl, String recipeUrl, List<String> ingredients) {

        this.baseUrl = baseUrl;
        this.recipeUrl = recipeUrl;
        this.ingredientsList = ingredients;


    }

    public Recipe(String baseUrl, String recipeUrl) {

        this.baseUrl = baseUrl;
        this.recipeUrl = recipeUrl;

        // Placeholder
        String ingredientsList = new RecipeParser(recipeUrl).parseIngredients();

    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
    public void setRecipeUrl(String recipeUrl) {
        this.recipeUrl = recipeUrl;
    }
    public void setIngredientsList(List<String> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }





}
