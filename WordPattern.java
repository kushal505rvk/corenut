package projec2;

public class WordPattern {
    public static void main(String[] args) {
        String word = "Corenuts";
        for (int i = 1; i <= word.length(); i++) {
            System.out.println(word.substring(0, i));
        }
    }
}

