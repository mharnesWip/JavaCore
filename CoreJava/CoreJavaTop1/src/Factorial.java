public class Factorial {
    public int fact(int input){
        if(input == 0){
            return 0;
        }else {
            int result = input;

            result = result + fact(input - 1);

            return result;
        }
    }

    public static void main(String args[]){
        int a = 5;
        int b = 7;
        int c = 3;

        Factorial obj = new Factorial();

        System.out.println("The factorial of " + a + " is: " + obj.fact(a));
        System.out.println("The factorial of " + b + " is: " + obj.fact(b));
        System.out.println("The factorial of " + c + " is: " + obj.fact(c));
    }
}
