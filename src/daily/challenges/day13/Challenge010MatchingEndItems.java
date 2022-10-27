package daily.challenges.day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge010MatchingEndItems {
    public static void main(String[] args) {
        String target = "1Qa";
        String regex = "^[a-zA-Z]*s$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
