import java.io.IOException;
import java.util.Scanner;


public class ConsoleInterface {

    private final Scanner scan;

    public ConsoleInterface () {

        scan = new Scanner(System.in);

    }

    public void start() throws IOException {

        printSpace(2);
        System.out.println("Welcome to Cook_Book v1.2");

        System.out.println("\nEnter a choice 1-2: ");
        System.out.print("______________________");
        System.out.print("\n1: Manage recipes\n2: Generate meal plan\n\n");



        String choice = scan.next();


        switch (choice) {
            case "1" -> manageRecipes();
            case "2" ->
                //FIXME: Create method
                    generateMeals();
        }
    }

    public void printSpace() {

        for(int i = 0; i < 10; i++){
            System.out.println();
        }

    }

    public void printSpace(int n) {

        for(int i = 0; i < n; i++){
            System.out.println();
        }

    }

    public String validateURL() {

        //FIXME: Make alternate way of validating URL


        /*
        boolean validUrl = false;

        if ()
        {}
        */

        //FIXME: Check if recipeCollection has been made already

        String inputUrl;
        while(true) {
            try {
                System.out.println("Enter a URL:");
                inputUrl = scan.nextLine();

                if (!(inputUrl.contains("https://") ||
                        (inputUrl.contains("www.") && inputUrl.endsWith(".com"))))
                {
                    throw new IOException("Invalid URL. Please try again.\n\n");
                }


                System.out.println("\n\n\nSearching...");
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return inputUrl;

    }
    public void addRecipeCollection () throws IOException {
        printSpace();
        System.out.println("Enter a valid URL: ");
        String validUrl = validateURL();

        new RecipeCollections().newRecipeCollection(validUrl);







    }


    public void removeRecipeCollection () {}
    public void searchRecipeCollection () {}

    public void addRecipe () {}
    public void removeRecipe () {}
    public void searchRecipe () {}
    public void manageRecipes() throws IOException {

        printSpace();
        System.out.println("Recipe Manager\n");


        System.out.println("\nEnter a choice 1-6:");
        System.out.print("____________________");
        System.out.print("\n1: Add recipe collection\n2: Remove recipe collection");
        System.out.print("\n3: Search recipe collection\n\n");
        System.out.print("4: Add recipe\n5: Remove recipe\n6: Search recipe\n\n");


        String choice = scan.next();

        switch(choice){

            case "1" -> addRecipeCollection();

            case "2" -> System.out.println("haven't programmed this part yet oops");

            default -> System.out.println("Invalid selection");


        }

    }

    public void generateMeals(){}



}
