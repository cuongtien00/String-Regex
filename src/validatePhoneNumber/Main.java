package validatePhoneNumber;

public class Main {
    private static String[] valiPhoneNumber= {"(84)-(0335770616)","(08)-(0975663332)","(84)-(0984898327)"};
    private static String[] inValiPhoneNumber= {"(a4)-(0335770616)","(08)-(975663332)","-840984898327"};
    private static RegularExpression expression;

    public static void main(String[] args) {
        expression = new RegularExpression();
        for (String a : valiPhoneNumber
             ) {
            System.out.println("PhoneNumber " + a+" is valid " + expression.validatePhoneNumber(a));

        }
        for (String a: inValiPhoneNumber
             ) {
            System.out.println("PhoneNumber " + a+" is valid " + expression.validatePhoneNumber(a));
        }
    }
}
