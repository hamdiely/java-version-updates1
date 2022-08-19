package m4_double_colon_op.double_colon_op_demo;

public class demo {
    public static void main(String[] args) {
       // lambda using the interface
        Calculate s1 = (x,y)-> System.out.println(x+y);
        s1.calculate(4,5);

        // lambda using calculator class static method
        // method
        Calculate s2 = (x,y)-> Calculator.findSum(x,y);
        s2.calculate(9,7);

        // using double colon operator
        Calculate s3 = Calculator::findSum;
        s3.calculate(8,10);

        // using instant method
        Calculator obj = new Calculator();
        Calculate s4= obj::findMultiply;

    }
}