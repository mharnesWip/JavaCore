public class GreatestInArray {
    public int greatest(int[] input){
        int greatest = 0;

        for (int i = 0; i < input.length; i++){
            if (input[i] > greatest){
                greatest = input[i];
            }
        }

        return greatest;
    }

    public static void main(String args[]){
        int[] init = {23, 533, 21, 53, 74, 363, 24, 747, 745, 745};
        int great = 0;

        GreatestInArray obj = new GreatestInArray();
        great = obj.greatest(init);

        System.out.println("Greatest number in the array: " + great);
    }
}
