public class CommandLineStringConcat {

    public void concat(String str1, String str2){
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(" Technologies ");
        builder.append(str2);

        System.out.println(builder);
        }

    public static void main(String args[]) {
        CommandLineStringConcat obj = new CommandLineStringConcat();
        String in1 = args[0];
        String in2 = args[1];

        obj.concat(in1, in2);
    }
}
