package Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public final class Drink extends Product{
    Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    public BigDecimal getDiscount(){
        //return condition ? value(if true) : value(if false);
        return LocalTime.now().isAfter(LocalTime.of(17, 30)) && LocalTime.now().isBefore(LocalTime.of(19, 30))
                ?super.getDiscount():BigDecimal.ZERO;

    }

    @Override
    public Drink applyRating(Rating newRating) {/* used to create a new obj which copies existing obj data
                                                   and applies a new rating to it*/
       return new Drink(getId(), getName(), getPrice(), newRating);
    }
}
