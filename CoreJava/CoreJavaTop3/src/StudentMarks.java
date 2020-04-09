public class StudentMarks {
    public double average(int in1, int in2, int in3){
        double avg = (in1+in2+in3)/3;
        return avg;
    }

    public static void main(String args[]){             //assumes input is as follows: name score score score name score score score
        StudentMarks obj = new StudentMarks();

        String stud1_name = args[0];
        String stud2_name = args[4];
        int[] stud1 = new int[3];
        int[] stud2 = new int[3];
        double stud1_avg = 0;
        double stud2_avg = 0;

        try{
            for(int i = 0; i < 3; i++){
                stud1[i] = Integer.parseInt(args[i+1]);
            }
            for(int i = 0; i < 3; i++){
                stud2[i] = Integer.parseInt(args[i+5]);
            }

            stud1_avg = obj.average(stud1[0], stud1[1], stud1[2]);
            stud2_avg = obj.average(stud2[0], stud2[1], stud2[2]);

            System.out.println("Student Name: " + stud1_name + "  -------->  Avg Score: " + stud1_avg);
            System.out.println("Student Name: " + stud2_name + "  -------->  Avg Score: " + stud2_avg);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Program Terminating");
        }
    }
}
