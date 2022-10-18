package daily.challenges.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge001MacthingAnythingButANewLine {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("^.{3}\\..{3}\\..{3}\\..{3}$").matcher("123.456.abc.def");
        while (matcher.find()) {
            System.out.println(matcher);
        }

        System.out.println(matcher.matches());
    }
}
