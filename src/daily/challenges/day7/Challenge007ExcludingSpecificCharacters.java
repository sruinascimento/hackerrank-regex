package daily.challenges.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge007ExcludingSpecificCharacters {
    public static void main(String[] args) {
        String target = "think?";
        String regex = "^[^\\d][^aeiou][^bcDF][^\\s][^AEIOU][^\\.,]$";
        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.find());
    }
}
