package m6_optional_bigdecimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,5,6,9,3);
        Optional<String> empty= Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        //System.out.println(empty.get());
        // ifPresent
        Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
         bigNumber.ifPresent(System.out::print);

         //get
        System.out.println(bigNumber.get());


    }
}
