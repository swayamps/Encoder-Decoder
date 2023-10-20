
public class Spark2{
    public static void main(String[] args) {
       String input = "ifmmp xpsme";
       String output = shiftLetters(input);
       System.out.println(output); // Output: "hello world"
   }

   public static String shiftLetters(String input) {
       StringBuilder builder = new StringBuilder();
       for (int i = 0; i < input.length(); i++) {
           char currentChar = input.charAt(i);
           if (currentChar > 'a' && currentChar <= 'z') {
               builder.append((char)(currentChar - 1));
           } else if (currentChar == 'a') {
               builder.append('z');
           } else {
               builder.append(currentChar);
           }
       }
       return builder.toString();
   }
}