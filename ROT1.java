public class ROT1 {
    public static String convertToRot1(String plaintext) {
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    c = 'a';
                } else if (c == 'Z') {
                    c = 'A';
                } else {
                    c++;
                }
            }
            ciphertext += c;
        }
        return ciphertext;
    }
}
