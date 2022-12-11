import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WebsiteParser {


    public List<String> parseRecipe(String recipeUrl) {

        List<String> ingredients = null;


        return ingredients;
    }

    public Set<String> parseBaseUrl(String baseUrl) throws IOException {

        URL websiteUrl = new URL(baseUrl);
        URLConnection websiteConnection = websiteUrl.openConnection();

        Document doc = Jsoup.parse(websiteConnection.getInputStream(), "UTF-8", baseUrl);
        Elements links = doc.select("a[href]");

        Set<String> baseRecipeLinks = new HashSet<>();
        String currentUrl;

        for (Element link : links) {


            if(link.attr("href").contains("/recipe/") || link.attr("href").contains("/recipes/")) {

                currentUrl = link.attr("href");

                baseRecipeLinks.add(currentUrl);

            }


        }
        return baseRecipeLinks;
    }



}
