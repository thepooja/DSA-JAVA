package level1.StringsPrograms;

public class ReverseEachWordString {

    public static void main(String[] args) {
        String s = "abcd efg hijk";
        String st = reverseWords(s);
        System.out.println(st);

    }

    private static String reverseWords(String s) {
        String[] st = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word:st)
        {
            StringBuilder reverseWord = new StringBuilder(word);
            result.append(reverseWord.reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
