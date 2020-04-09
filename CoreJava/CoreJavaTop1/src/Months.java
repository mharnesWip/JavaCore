public class Months {

    public void convertMonth(int m){
        switch (m){
            case 1: System.out.println("Input: " + m);
                System.out.println("Month: January");
                break;
            case 2: System.out.println("Input: " + m);
                System.out.println("Month: February");
                break;
            case 3: System.out.println("Input: " + m);
                System.out.println("Month: March");
                break;
            case 4: System.out.println("Input: " + m);
                System.out.println("Month: April");
                break;
            case 5: System.out.println("Input: " + m);
                System.out.println("Month: May");
                break;
            case 6: System.out.println("Input: " + m);
                System.out.println("Month: June");
                break;
            case 7: System.out.println("Input: " + m);
                System.out.println("Month: July");
                break;
            case 8: System.out.println("Input: " + m);
                System.out.println("Month: August");
                break;
            case 9: System.out.println("Input: " + m);
                System.out.println("Month: September");
                break;
            case 10: System.out.println("Input: " + m);
                System.out.println("Month: October");
                break;
            case 11: System.out.println("Input: " + m);
                System.out.println("Month: November");
                break;
            case 12: System.out.println("Input: " + m);
                System.out.println("Month: December");
                break;
        }
    }

    public static void main(String args[]){
        int mn1 = 8;
        int mn2 = 4;
        int mn3 = 7;
        int mn4 = 12;

        Months obj = new Months();

        obj.convertMonth(mn1);
        obj.convertMonth(mn2);
        obj.convertMonth(mn3);
        obj.convertMonth(mn4);
    }
}
