package m1_generic.genericMethod;

public class Test {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Double[] decimals = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] names= {"John", "Max", "Emily", "Drew"};
        Dog[] dogs = {new Dog(), new Dog()};

        Generics.print(numbers);
        System.out.println();
        Generics.print(decimals);
        System.out.println();
        Generics.print(names);
        System.out.println();
        System.out.println(dogs);
    }
}
