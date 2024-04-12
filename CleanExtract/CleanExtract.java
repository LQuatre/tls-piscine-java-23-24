import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CleanExtract {
    public static String extract(String s) {
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("(?:\\|\\s*|(?<=\\|)|(?<=^))(.*?\\..*?)(?=(\\|\\s*|$))\n");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            String extracted = matcher.group(1).trim();
            result.append(extracted).append(" ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }
}