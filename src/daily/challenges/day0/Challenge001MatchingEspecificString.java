package daily.challenges.day0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge001MatchingEspecificString {
    public static void main(String[] args) {
        String text = "The hackerrank team is on a mission to flatten the world by restructuring the DNA of every company on the planet. We rank programmers based on their coding skills, helping companies source great programmers and reduce the time to hire. As a result, we are revolutionizing the way companies discover and evaluate talented engineers. The hackerrank platform is the destination for the best engineers to hone their skills and companies to find top engineers.";
        Matcher matcher = Pattern.compile("hackerrank").matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("Number of matches : %d%n", count);
    }
}
