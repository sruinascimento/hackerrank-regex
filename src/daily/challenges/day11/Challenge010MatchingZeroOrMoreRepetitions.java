package daily.challenges.day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge010MatchingZeroOrMoreRepetitions {
    public static void main(String[] args) {
        String target = "13123sc132123";
        String regex = "^\\d{2,}[a-z]*[A-Z]*$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
