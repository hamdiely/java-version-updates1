package m4_double_colon_op;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class testA{
    public static void main(String[] args) {

        BiConsumer<String,String> b= (s,t)-> System.out.println(s+" "+t);
        b.accept("hello","hi");
        //System.out.println("hello);
        // using method reference

        Consumer<String> c = System.out::println;
        c.accept("I will be better in this ");
        System.out.println("************************-************");

        // using lambda expression
        Calculator result = (s,t)->(s+t);
        System.out.println(result.add(3,4));

        // method reference
        Calculator result2 = Math::addExact;
        System.out.println(result2.add(3,4));
        

        



        
    }

}