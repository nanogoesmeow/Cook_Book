import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.ArrayList;

public class RecipeParser {

    private String urlToSearch;
    private List<String> pageUrls;

    public void RecipeParser () {

        urlToSearch = "";

    }

    public void setNewUrl (String newUrl) {

        urlToSearch = newUrl;

    }

    public void printListUrl(){

        printListUrl(pageUrls);

    }
    public void printListUrl (List<String> pageUrls) {

        System.out.println(urlToSearch);

        for (String pageUrl : pageUrls) {
            System.out.println(pageUrl);
        }

        System.out.println("\nNumber of recipies: " + pageUrls.size());
    }

    public List<String> getPageUrls (List<String>pageUrls) {
        return pageUrls;
    }

    public String getUrlToSearch (){
        return urlToSearch;
    }

    public static void addURLs (List<String> pageUrls, BufferedReader websiteBuffer, String urlToSearch) throws IOException {

        String line = websiteBuffer.readLine();

        while (line != null) {

            String pageUrl;

            if(line.contains("<a")) {



                int hrefIndex = line.indexOf("href");
                int openQuoteIndex = line.indexOf("\"", hrefIndex);

                pageUrl = line.substring(openQuoteIndex + 1, line.indexOf("\"", openQuoteIndex + 1));

                if (pageUrl.equals("https://www.tasteofhome.com/recipes/")) {
                        break;
                }

                if((pageUrl.contains("/recipes/") || pageUrl.contains("/recipe/")) && pageUrl.contains("https://") && !pageUrl.contains("meal-types")){
                        pageUrls.add(pageUrl);
                }

                else if ((pageUrl.contains("/recipes/") || pageUrl.contains("/recipe/"))) {
                    String baseUrl = urlToSearch.substring(0, urlToSearch.indexOf(".com") + 4);
                    pageUrl = baseUrl + pageUrl;
                    pageUrls.add(pageUrl);


                }

            }

            line = websiteBuffer.readLine();

        }


    }




    public void parseRecipe() throws IOException {


        // using "https://www.tasteofhome.com/collection/tasty-low-carb-dinner-ideas/" as test

            // Creates a new websiteURL object and establishes a connection
            URL websiteUrl = new URL(urlToSearch);
            URLConnection websiteConnection = websiteUrl.openConnection();

            // All the data from the URL connection gets placed into an InputStream
            InputStream websiteStream = websiteConnection.getInputStream();


            // BufferedReader can read line by line, with the help of an InputStreamReader that reads the InputStream
            BufferedReader websiteBuffer = new BufferedReader(new InputStreamReader(websiteStream));

            // Creates new list of URLs and uses a method to add URLs to that list, then prints the URLs
            pageUrls = new ArrayList<>();
            addURLs(pageUrls, websiteBuffer, getUrlToSearch());


            //FIXME: Output URLs to .txt file using FileWriter






        }





}
