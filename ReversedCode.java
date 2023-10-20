public class ReversedCode {
    public String Reversed(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedSentence.append(reversedWord + " ");
        }

        return reversedSentence.toString();
    }
}





