public class A1Z26Decoder {

    public static String convertA1Z26ToEnglish(String a1z26Code) {
        String[] numbers = a1z26Code.split(" ");

        StringBuilder plainText = new StringBuilder();
        for (String number : numbers) {
            int asciiValue = Integer.parseInt(number) + 64;
            char decodedChar = (char) asciiValue;
            plainText.append(decodedChar);
        }

        return plainText.toString();
    }
}