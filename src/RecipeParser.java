import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;



public class RecipeParser {

    private String urlToSearch;
    private Set<String> baseRecipeLinks;

    public RecipeParser () {
        urlToSearch = "";
    }

    public RecipeParser (String inputUrl) {
        urlToSearch = inputUrl;
    }

    public void setUrlToSearch (String newUrl) {

        urlToSearch = newUrl;

    }

    public String getUrlToSearch () {

        return urlToSearch;
    }




    public Set<String> parseBaseRecipeURL() throws IOException {


        URL websiteUrl = new URL(urlToSearch);
        URLConnection websiteConnection = websiteUrl.openConnection();

        Document doc = Jsoup.parse(websiteConnection.getInputStream(), "UTF-8", urlToSearch);
        Elements links = doc.select("a[href]");

        baseRecipeLinks = new HashSet<>();
        String currentUrl;

        for (Element link : links) {


            if(link.attr("href").contains("/recipe/") || link.attr("href").contains("/recipes/")) {

                currentUrl = link.attr("href");

                baseRecipeLinks.add(currentUrl);

            }


        }
        return baseRecipeLinks;
    }

    public String parseIngredients () {
        String placeHolder = null;
        //FIXME: method that takes in a recipeURL ,derived from a list of recipes, and parse
        // the ingredients. returns an List<> of ingredients to a Recipe object
        return placeHolder;
    }







}