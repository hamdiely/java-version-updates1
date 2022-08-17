package m1_generic.predicateTask;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    public static void main(String[] args) {

        List<Integer> predicateList = Arrays.asList(10,15,20,25,30);
         int c= countPredicate(predicateList, new OddPredicate());
        System.out.println("The number of odd integer in List1 is: "+c);





    }
    public static <T> int countPredicate(List<Integer> list, OddPredicate pred ){
        int count=0;
        for (Integer each : list) {
            if(pred.test(each)) {
                count++;
            }
        }
        return count;
    }

}