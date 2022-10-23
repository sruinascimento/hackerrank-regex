package daily.challenges.day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge008MatchingCharactersRange {
    public static void main(String[] args) {
        String target = "h4CkR";
        String regex = "^[a-z][1-9][^a-z][^A-Z][A-Z]$?";
        Matcher matcher = Pattern.compile(regex).matcher(target);
        System.out.println(matcher.find());
    }
}
