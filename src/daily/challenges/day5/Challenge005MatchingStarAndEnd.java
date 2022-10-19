package daily.challenges.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge005MatchingStarAndEnd {
    public static void main(String[] args) {
        String target = "0qwer.";
        String regex = "^\\d\\w{4}\\.$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
