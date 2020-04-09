// Thread responsible for printing the randomly generated number in PrintNumFact.java

public class Thread1 implements Runnable{
    Thread t;
    private int input;

    public Thread1(int rand_num){
        t = new Thread(this, "Print Number Thread");
        input = rand_num;
//        System.out.println(t + " has been created");
        t.start();
    }

    public void run(){
        try {
            System.out.println("Number: " + input);
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(t + " interrupted");
        }
    }
}