package daily.challenges.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge010MatchingXYRepetitions {
    public static void main(String[] args) {
        String target = "3threeormorealphabets.";
        String regex = "^\\d{1,2}[a-zA-Z]{3,}\\.{0,3}$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
