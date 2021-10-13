package validateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX_CLASS = "^[CAP][0-9]{4}[GHIKLM]$";

    public Regex() {
        pattern = pattern.compile(REGEX_CLASS);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
