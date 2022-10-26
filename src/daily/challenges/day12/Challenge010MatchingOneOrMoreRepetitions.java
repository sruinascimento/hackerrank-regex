package daily.challenges.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge010MatchingOneOrMoreRepetitions {
    public static void main(String[] args) {
        String target = "1Qa";
        String regex = "^\\d+[A-Z]+[a-z]+$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
