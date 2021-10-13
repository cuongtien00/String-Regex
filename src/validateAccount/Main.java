package validateAccount;

public class Main {
    private static AccountExample accountExample;
    private static String[] valieAcc = {"tythut123_tn", "longco555_colong", "hiephoang1126_mo"};
    private static String[] invalieAcc = {"tythut123_tn", "long", "Hiephoang1126_mo"};

    public static void main(String[] args) {
        accountExample = new AccountExample();

        for (String a : valieAcc
        ) {
            System.out.println("Account " + a + " is valid " + accountExample.validate(a));
        }
        for (String a : invalieAcc
        ) {
            System.out.println("Account " + a + " is valid " + accountExample.validate(a));
        }

    }
}
