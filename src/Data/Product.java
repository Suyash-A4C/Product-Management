package Data;

import java.math.*;
import java.time.LocalDate;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

public sealed abstract class Product implements Rateable<Product> permits Food, Drink {
    public static final BigDecimal DISCOUNT = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    Product(int id, String name, BigDecimal price, Rating rating){
        this.id=id;
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    Product(int id, String name, BigDecimal price){
       this(id, name, price, Rating.NOT_RATED);

    }
    Product(){
        this(0, "no name", BigDecimal.valueOf(0));
    }

    @Override
    public String toString(){
        return  id+" "+name+" "+price+" "
                +getDiscount()+" "+
//                rating.getStars()+
                " "+ getBestBefore();

//        return "Product{"+
//                " Id "+ id+
//                " Name "+ name+
//                " Price "+ price+
//                " Rating "+rating+
//                "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
        if(o instanceof Product product) {
            return id == product.id && Objects.equals(name, product.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public abstract Product applyRating(Rating newRating);/* used to create a new obj which copies existing obj data
                                                             and applies a new rating to it*/
    public LocalDate getBestBefore(){
        return LocalDate.now();
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT).setScale(2,HALF_UP);
    }
    public Rating getRating(){
        return rating;
    }

}
