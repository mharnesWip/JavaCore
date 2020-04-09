public class Palindrome {

    public boolean isPalindrome(String input){
        boolean result = true;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                result = false;
            }
        }

        return result;
    }

    public static void main(String args[]){
        Palindrome obj = new Palindrome();
        String testString = args[0];

        boolean result = obj.isPalindrome(testString);
        if(result == true){
            System.out.println(testString + " is a palindrome!");
        }else{
            System.out.println(testString + " is not a palindrome.");
        }
    }
}
