package m6_optional_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount = 374.34;

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 =new BigDecimal("375.34");
        System.out.println(b1.subtract(b2));

        // scaling
        BigDecimal num1 = new BigDecimal("23.13");

        System.out.println(num1.setScale(1, RoundingMode.CEILING));

        // Use CompareTo() instead of equals()




    }
}
