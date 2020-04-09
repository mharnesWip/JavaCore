import java.lang.Math;

public class MinToDays {
    static double a;
    static double b;
    static double c;

    public void convert(double mins){
        double years, days, mins_remaining;

        years = Math.floor(mins / 525600);

        if(mins < 525600){
            mins_remaining = mins;
        }else{
            mins_remaining = mins%525600;
        }

        days = Math.floor(mins_remaining/1440);

        System.out.println("The conversion from " + mins + " to years and days is: " + years + " years, and " + days + "days.");
    }

    public void setA(double var){
        a = var;
    }
    public void setB(double var){
        b = var;
    }
    public void setC(double var){
        c = var;
    }
    public static void main(String args[]){
        MinToDays obj = new MinToDays();

        obj.setA(1000000);
        obj.setB(2000000);
        obj.setC(50000);

        obj.convert(a);
        obj.convert(b);
        obj.convert(c);
    }
}
