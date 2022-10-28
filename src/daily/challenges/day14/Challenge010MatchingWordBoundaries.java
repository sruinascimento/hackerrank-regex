package daily.challenges.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge010MatchingWordBoundaries {
    public static void main(String[] args) {

        String target = "Found any match?";
        String regex = "\\b[aeiouAEIOU][A-Za-z]*\\b";
        Matcher matcher = Pattern.compile(regex).matcher(target);
        System.out.println(matcher.find());
    }
}
