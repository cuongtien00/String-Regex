package validateEmail;

public class Main {
    private static EmailExample emailExample;
    private static String[] valiEmail = {"a@gmail.com", "cuonghiep000@gmail.com", "dothanhlong@gmail.com"};
    private static String[] invaliEmail = {"@gmail.com", "/@gmail.com", "dothanhlong@gmail,com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String a : valiEmail
        ) {
            System.out.println("Email " + a + " is valid: " + emailExample.validateEmail( a));
        }
        for (String a : invaliEmail
        ) {
            System.out.println("Email " + a + "is valid: " + emailExample.validateEmail( a));
        }
    }

}
