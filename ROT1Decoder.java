public class ROT1Decoder {
    public static String convertFromRot1(String ciphertext) {
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a') {
                    c = 'z';
                } else if (c == 'A') {
                    c = 'Z';
                } else {
                    c--;
                }
            }
            plaintext += c;
        }
        return plaintext;
    }
}
