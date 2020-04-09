import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeDB{
    ArrayList<Employee> fullList = new ArrayList();

    private boolean addEmployee(Employee e){
        boolean result = false;

        if(fullList.add(e)){
            result = true;
        }

        return result;
    }

    private boolean deleteEmployee(int code){
        boolean result = false;

        ListIterator<Employee> itr = fullList.listIterator();

        while(itr.hasNext()){
            if(itr.next().eCode == code){
                itr.remove();
                result = true;
            }
        }
        return result;
    }

    public String showPaySlip(int code){
        String paySlip = "";

        ListIterator<Employee> itr = fullList.listIterator();

        while(itr.hasNext()){
            if(itr.next().eCode == code){
                itr.previous();
                paySlip = itr.next().pay;
            }
        }

        return paySlip;
    }

    public Employee[] listAll(){
        Employee output[] = new Employee[fullList.size()];

        ListIterator<Employee> itr = fullList.listIterator();

        try {
            int i = 0;
            while (itr.hasNext()) {
                output[i] = itr.next();
                i++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        return output;
    }

    public String toString(Employee[] arr){
        String result = "";
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            builder.append("Name: " + arr[i].name + "\t");
            builder.append("eCode: " + arr[i].eCode + "\t");
            builder.append("Pay: " + arr[i].pay + "\t");
            builder.append("\n");
        }
        result = builder.toString();
        return result;
    }

    public static void main(String args[]){
        EmployeeDB db = new EmployeeDB();
        Employee emp1 = new Employee("Joe", 2838, "100000");
        Employee emp2 = new Employee("Carol", 6666, "200000");
        Employee emp3 = new Employee("Jeff", 2938, "150000");
        Employee emp4 = new Employee("No Hands", 2093, "50000");

        if(db.addEmployee(emp1)){
            System.out.println("Employee 1 added successfully");
        }else{
            System.out.println("Employee 1 add unsuccessful");
        }

        if(db.addEmployee(emp2)){
            System.out.println("Employee 2 added successfully");
        }else{
            System.out.println("Employee 2 add unsuccessful");
        }

        if(db.addEmployee(emp3)){
            System.out.println("Employee 3 added successfully");
        }else{
            System.out.println("Employee 3 add unsuccessful");
        }

        if(db.addEmployee(emp4)){
            System.out.println("Employee 4 added successfully");
        }else{
            System.out.println("Employee 4 add unsuccessful");
        }

        System.out.println();
        System.out.println("Staff Pay");
        System.out.println(emp1.name + ": " + db.showPaySlip(emp1.eCode));
        System.out.println(emp2.name + ": " + db.showPaySlip(emp2.eCode));
        System.out.println(emp3.name + ": " + db.showPaySlip(emp3.eCode));
        System.out.println(emp4.name + ": " + db.showPaySlip(emp4.eCode));

        System.out.println();
        System.out.println("List all information");
        System.out.println(db.toString(db.listAll()));

        System.out.println();
        System.out.println("Deleting Employees");
        db.deleteEmployee(emp3.eCode);
        System.out.println("Jeff should be deleted");
        System.out.println(db.toString(db.listAll()));
        db.deleteEmployee(emp2.eCode);
        System.out.println("Carol should be deleted");
        System.out.println(db.toString(db.listAll()));
        db.deleteEmployee(emp4.eCode);
        System.out.println("No Hands should be deleted");
        System.out.println(db.toString(db.listAll()));
    }
}
