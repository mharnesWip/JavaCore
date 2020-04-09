import java.util.HashSet;

public class EmployeeHashSet {

    public static void main(String args[]){
        HashSet<Employee> empSet = new HashSet<Employee>();
        Employee emp1 = new Employee("Joe", 2938, "100");
        Employee emp2 = new Employee("Jeff", 2938, "100");
        Employee emp3 = new Employee(";alksdhf", 7374, "100");
        Employee emp4 = new Employee(";lksj", 2089, "1000");
        Employee emp5 = new Employee("l;as", 2338, "100");

        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        empSet.add(emp5);
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        empSet.add(emp5);

        for(Employee i: empSet)
            System.out.println(i.toString());
    }
}
