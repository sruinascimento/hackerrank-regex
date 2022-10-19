package daily.challenges.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge004MatchingWordAndNonWord {
    public static void main(String[] args) {
        String target = "www.hackerrank.com";
        String regex = "\\w{3}\\W\\w{10}\\W\\w{3}";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
