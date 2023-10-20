public class AtbashDecoder {
    public static String decodeAtbash(String atbashCipher) {
        
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < atbashCipher.length(); i++) {
            char character = atbashCipher.charAt(i);

            if (Character.isUpperCase(character)) {
                int asciiValue = ((int) 'Z') - ((int) character) + ((int) 'A');
                plainText.append((char) asciiValue);
            }
            else if (Character.isLowerCase(character)) {
                int asciiValue = ((int) 'z') - ((int) character) + ((int) 'a');
                plainText.append((char) asciiValue);
            }
            else {
                plainText.append(character);
            }
        }
        return plainText.toString();
    }
}