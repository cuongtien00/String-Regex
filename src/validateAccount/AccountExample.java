package validateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;
    private  static  final  String REGEX_ACCOUNT = "^[_a-z0-9]{6,}$";

    public AccountExample() {
        pattern = pattern.compile(REGEX_ACCOUNT);
    }
    public boolean validate(String account){
        CharSequence input;
        matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
