import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static String validateURL(String inputUrl, Scanner scan) {

        //FIXME : Make alternate way of validating URL

            //FIXME: Check if recipe list has been made and stored.
        /*
        boolean validUrl = false;

        if ()
        {}
        */


        while(true) {
            try {
                System.out.println("Enter a URL:");
                inputUrl = scan.nextLine();

                if (!(inputUrl.contains("https://") ||
                        (inputUrl.contains("www.") && inputUrl.endsWith(".com"))))
                {
                        throw new IOException ("Invalid URL. Please try again.\n");
                }


                System.out.println("\n\n\nSearching...");
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return inputUrl;

    }




    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        String inputUrl = "";
        String validUrl = validateURL(inputUrl, scan);




        new RecipeList(validUrl);










    }
}