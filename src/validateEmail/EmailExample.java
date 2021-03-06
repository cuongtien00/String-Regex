package validateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = pattern.compile(EMAIL_REGEX);
    }
    public boolean validateEmail(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
