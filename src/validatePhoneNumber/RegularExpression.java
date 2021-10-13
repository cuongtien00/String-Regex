package validatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX_PHONE = "^[(][0-9]{2}[)][-][(][0-9]{10}[)]$";

    public RegularExpression() {
        pattern = pattern.compile(REGEX_PHONE);
    }
    public boolean validatePhoneNumber(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
