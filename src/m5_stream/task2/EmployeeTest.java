package m5_stream.task2;

public class EmployeeTest {
    public static void main(String[] args) {
        //print all emails
        EmployeeData.readAll()
                .map(Employee::getEmpId)
                .forEach(System.out::print);
    }
}