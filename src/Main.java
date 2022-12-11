
import java.io.File;
import java.io.IOException;


public class Main {

    public static void createMasterRecipe() throws IOException {
        File masterRecipeCollection = new File("masterRecipeCollection.txt");
        masterRecipeCollection.createNewFile();


    }



    public static void main(String [] args) throws IOException {

        // createMasterRecipe();

        ConsoleInterface console = new ConsoleInterface();
        console.start();


    }
}