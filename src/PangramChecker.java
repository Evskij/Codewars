import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

 */
public class PangramChecker {


    public boolean check(String sentence){
        boolean flag = false;
        String alphabet = "[^A-Za-z]";
        String duplicate = "(.)(?=.*\\1)";
        int stingLength = sentence.replaceAll(alphabet, "").toLowerCase().replaceAll(duplicate, "").length();
        if (stingLength == 26) {
            flag = true;
        }

        return flag;
    }
}