package m5_stream.task1;

import java.util.Comparator;

public class DishDemo {
    public static void main(String[] args) {
        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(D->D.getCalories()<400)
                .map(i->i.getName())
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        //Print the length of the name of each dish
        DishData.getAll().stream()

                .map(i->i.getName().length())
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish-> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        //Print all dish name that are below 400 calories in sorted
          DishData.getAll().stream()
                  .filter(dish->dish.getCalories()<400)
                  .sorted(Comparator.comparing(Dish::getCalories))
                  .map(Dish::getName)
                  .forEach(System.out::println);


        }
    }