import java.util.ArrayList;
import java.util.ListIterator;

public class Employee {
    int eCode;
    String name, pay;

    public Employee(String nm, int code, String py){
        eCode = code;
        name = nm;
        pay = py;
    }

    public String toString(){
        String result = "";
        StringBuilder builder = new StringBuilder();

        builder.append("Name: " + name + "\t");
        builder.append("eCode: " + eCode + "\t");
        builder.append("Pay: " + pay + "\t");

        result = builder.toString();
        return result;
    }
}

