package daily.challenges.day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge006MatchingSpecifcCharacters {
    public static void main(String[] args) {
        String target = "1203x.";
        String regex = "^[123][120][xs0][30Aa][xsu][.,]$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
