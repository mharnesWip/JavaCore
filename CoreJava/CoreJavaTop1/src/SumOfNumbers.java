public class SumOfNumbers {
    public int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }

    public static void main(String args[]){
        int w, x, y, z, result;
        String input = args[0];

        w = input.charAt(0);
        x = input.charAt(1);
        y = input.charAt(2);
        z = input.charAt(3);

        SumOfNumbers obj = new SumOfNumbers();
        result = obj.sum(w,x,y,z);

        System.out.println("The sum of all digits entered is " + result);
    }
}
