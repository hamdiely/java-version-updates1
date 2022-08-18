package m1_generic.genericMethod;

public class Generics {
    public static<T> void print(T[] arr){
        for (T each : arr) {
            System.out.print(each+" ");
        }

    }
}
