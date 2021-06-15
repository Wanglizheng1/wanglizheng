package day42;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Wang
 * @version 0.0
 */

@SuppressWarnings("all")
public class GenericExercise01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("tom", 10000, new MyDate(2001, 12, 11)));
        employees.add(new Employee("tom", 50000, new MyDate(2003, 1, 14)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
    }
}




