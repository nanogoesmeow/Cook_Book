import java.util.List;


public class Recipe {


    private String baseUrl;
    private String recipeUrl;
    //private List<String> ingredientsList;

    public Recipe () {
        this.baseUrl = null;
        this.recipeUrl = null;
        //this.ingredientsList = null;
    }

    public Recipe (String baseUrl, String recipeUrl) {
        this.baseUrl = baseUrl;
        this.recipeUrl = recipeUrl;
        //this.ingredientsList = new WebsiteParser().parseRecipe(recipeUrl);

    }

    public String getBaseUrl () {

        return baseUrl;
    }

    public String getRecipeUrl () {

        return recipeUrl;
    }






    //public Recipe (String recipeUrl) {

    //}




}
