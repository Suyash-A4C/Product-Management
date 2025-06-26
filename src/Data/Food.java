package Data;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product{
    LocalDate bestBefore;

    Food(int id, String name, BigDecimal price, Rating rating,LocalDate bestBefore){
        super(id,name,price,rating);
        this.bestBefore=bestBefore;
    }

    public LocalDate getBestBefore(){
        return bestBefore;
    }

//    public String toString() {
//        return super.toString()+" Best Before Date- "+ bestBefore;
//    }

    @Override
    public BigDecimal getDiscount() {
        //return condition ? value(if true) : value(if false);
       return bestBefore.isEqual(LocalDate.now()) ? super.getDiscount():BigDecimal.ZERO;
    }

    @Override
    public Food applyRating(Rating newRating) {/* used to create a new obj which copies existing obj data
                                                  and applies a new rating to it*/
        return new Food(getId(), getName(), getPrice(), newRating , bestBefore);
    }
}
