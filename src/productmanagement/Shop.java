package productmanagement;
import Data.*;
import java.math.*;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
//import static Data.Rating.*; we can import this to remove the "Rating." to initialise rating

public class Shop {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//
//        int a = Integer.parseInt(in.next());
//        String b = in.next();
//        BigDecimal c = new BigDecimal(in.next());
//        Rating d = Rating.valueOf(in.next());
//
//        Product p1 = new Product(a,b,c,d);
//
//        int z = Integer.parseInt(in.next());
//        String x = in.next();
//        BigDecimal y = new BigDecimal(in.next());
//
//        Product p2 = new Product(z,x,y);
        Locale India = new Locale("en", "IN");
        ProductManager pm = new ProductManager(India);
        Product p1 = pm.createProduct(101, "tea", BigDecimal.valueOf(10.00), Rating.NOT_RATED);
        pm.reviewProduct(p1, Rating.THREE_STAR, "its good but needs more sugar");
        pm.printProductReport();
        Product p2 = pm.createProduct(102, "Cake", BigDecimal.valueOf(399.99),Rating.NOT_RATED, LocalDate.now().plusDays(7));
        pm.reviewProduct(p2,Rating.FOUR_STAR, "This Chocolate Cake is yumm as HELL");
        pm.printProductReport();
        Product p3 = pm.createProduct(103, "Toffee", BigDecimal.valueOf(2),Rating.NOT_RATED);
        pm.reviewProduct(p3, Rating.TWO_STAR, "Could Be Better");
        pm.printProductReport();
//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(12.00),Rating.FOUR_STAR);
//        Product p3 = pm.createProduct (103, "cake", BigDecimal.valueOf(399.00), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(104,"Cookie", BigDecimal.valueOf(30.00),Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct (105,"Chocolate", BigDecimal.valueOf(20.00),Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(106,"Chocolate", BigDecimal.valueOf(29.99),Rating.FIVE_STAR, LocalDate.now().plusDays(3));
//        Product p8 =  p4.applyRating(Rating.FIVE_STAR);
//        Product p9 =  p1.applyRating(Rating.TWO_STAR);
//
//
//        System.out.println("the product list is:     ");
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);




    }
}