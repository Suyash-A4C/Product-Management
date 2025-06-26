package Data;

import java.math.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class ProductManager {
    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    private Product product;
    private Review review;

//    public ProductManager(){};

    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("Data.resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);

    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        product =  new Food(id, name, price, rating, bestBefore);
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        product =  new Drink(id, name, price, rating);
        return product;
    }

    public Product reviewProduct(Product product, Rating rating, String comments){
        review = new Review(rating, comments);
        this.product = product.applyRating(rating);
        return this.product;
    }

    public void printProductReport(){
        StringBuilder txt = new StringBuilder();
        String type = (product instanceof Food)?resources.getString("food"):resources.getString("drink");
        txt.append(MessageFormat.format(resources.getString("product"),product.getName(),moneyFormat.format(product.getPrice()),
                product.getRating().getStars(), dateFormat.format(product.getBestBefore()),
                type));
        txt.append('\n');
        if(review!=null){
            txt.append(MessageFormat.format(resources.getString("review"), review.rating().getStars(), review.comments()));
        }else{txt.append(resources.getString("no.reviews"));}
        txt.append('\n');

        System.out.println(txt);
    }
}
