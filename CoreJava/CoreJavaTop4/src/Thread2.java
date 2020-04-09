// Thread responsible for printing the factorial of randomly generated number in PrintNumFact.java

public class Thread2 implements Runnable{
    Thread fact_t;
    private int input;

    private int findFactorial(int fact_num){
        int result = 0;

        if (fact_num == 0) {
            return result;
        } else {
            result = fact_num + findFactorial(fact_num - 1);
        }

        return result;
    }

    public Thread2(int rand_num) {
        fact_t = new Thread(this, "Print Factorial Thread");
        input = rand_num;
//        System.out.println(fact_t + " created");
        fact_t.start();
    }

    public void run() {
        try {
            System.out.println("Factorial of " + input + ": " + findFactorial(input));
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}