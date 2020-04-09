public class CurrentTime {
    public static void main(String args[]){
        DemoThread dthread = new DemoThread();
    }
}

class DemoThread implements Runnable{
    Thread t;
    public DemoThread(){
        t = new Thread(this, "Countdown Thread");
        System.out.println(t + " created");
        t.start();
    }

    public void run(){
        for(int i = 0; i < 10; i++) {
            try {
                System.out.println("Current Time: " + System.currentTimeMillis());
                t.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
