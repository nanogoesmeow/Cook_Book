import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        RecipeParser tasteofHome = new RecipeParser();

        tasteofHome.setNewUrl("https://www.tasteofhome.com/collection/tasty-low-carb-dinner-ideas/");

        tasteofHome.parseRecipe();

        tasteofHome.printListUrl();






    }
}