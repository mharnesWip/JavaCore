import java.util.Random;

public class PrintNumFact {
    public static void main(String args[]){
        Random rand = new Random();
        int input = rand.nextInt(10);
        Thread1 t1 = new Thread1(input);
        Thread2 t2 = new Thread2(input);

        input = rand.nextInt(10);
        t1 = new Thread1(input);
        t2 = new Thread2(input);
    }
}


