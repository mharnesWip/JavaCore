public class IntegerOutOfBounds {
    public void average(int in1, int in2, int in3, int in4, int in5){
        double avg = (in1 + in2 + in3 + in4 + in5)/5;
        System.out.println("The calculated average is: " + avg);
    }

    public void averageFour(int in1, int in2, int in3, int in4){
        double avg = (in1 + in2 + in3 + in4)/4;
        System.out.println("The calculated average is: " + avg);
    }

    public void averageThree(int in1, int in2, int in3){
        double avg = (in1 + in2 + in3)/3;
        System.out.println("The calculated average is: " + avg);
    }

    public void averageTwo(int in1, int in2){
        double avg = (in1 + in2)/2;
        System.out.println("The calculated average is: " + avg);
    }

    public static void main(String args[]){
        IntegerOutOfBounds obj = new IntegerOutOfBounds();
        int input[] = new int[5];

        try{
            input[0] = Integer.parseInt(args[0]);
            input[1] = Integer.parseInt(args[1]);
            input[2] = Integer.parseInt(args[2]);
            input[3] = Integer.parseInt(args[3]);
            input[4] = Integer.parseInt(args[4]);

            obj.average(input[0], input[1], input[2], input[3], input[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("User did not enter 5 integers");

            int len = args.length;

            switch (len){
                case 0: System.out.println("No integers provided, Avg: 0");
                case 1: System.out.println("1 integer provided, Avg: " + input[0]);
                case 2: obj.averageTwo(input[0], input[1]);
                case 3: obj.averageThree(input[0], input[1], input[2]);
                case 4: obj.averageFour(input[0], input[1], input[2], input[3]);
            }
        }
    }
}
