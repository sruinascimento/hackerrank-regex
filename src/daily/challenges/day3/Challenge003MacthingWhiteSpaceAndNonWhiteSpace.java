package daily.challenges.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge003MacthingWhiteSpaceAndNonWhiteSpace {
    public static void main(String[] args) {
        String target = "12 11 15";
        String regex = "^\\S{2}\\s\\S{2}\\s\\S{2}$";

        Matcher matcher = Pattern.compile(regex).matcher(target);

        System.out.println(matcher.matches());
        System.out.println("Find? " + matcher.find());
        System.out.println(matcher);


    }
}
