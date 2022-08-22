package m5_stream.task1;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingMatching {

    public static void main(String[] args) {


        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("------------------------------------");

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        Optional<String> findAny = list1.parallelStream().filter(s->s.startsWith("D")).findAny();
        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("J")).findFirst();
        System.out.println(findAny);
        System.out.println(findFirst);

        System.out.println("-----------------------------");

















    }

}