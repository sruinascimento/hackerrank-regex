package daily.challenges.day9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge009MatchingXRepetitions {
    public static void main(String[] args) {
        String target = "h4CkR";
        String regex = "^[a-zA-Z02468]{40}[13579\\s]{5}$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
