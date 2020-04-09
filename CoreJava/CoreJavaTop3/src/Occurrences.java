public class Occurrences {
    public static void main(String args[]){
        String test1 = "how much could a would chuck chuck";
        String test2 = "sally sells sea shells";
        String test3 = "why do eye do this to myself";

        int u_occurrences_in_test1 = test1.length() - test1.replace("u","").length();
        int l_occurrences_in_test2 = test2.length() - test2.replace("l","").length();
        int y_occurrences_in_test3 = test3.length() - test3.replace("y","").length();

        System.out.println("Occurences of 'u' in 'how much could a would chuck chuck' - " + u_occurrences_in_test1);
        System.out.println("Occurences of 'l' in 'sally sells sea shells' - " + l_occurrences_in_test2);
        System.out.println("Occurences of 'y' in 'why do eye do this to myself' - " + y_occurrences_in_test3);
    }
}
