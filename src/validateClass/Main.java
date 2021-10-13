package validateClass;

public class Main {

    public static void main(String[] args) {
        Regex regex = new Regex();
        System.out.println(regex.validate("C0318G"));
        System.out.println("------");
        System.out.println(regex.validate("CahahG"));
        System.out.println(regex.validate("C0318O"));
        System.out.println(regex.validate("M0318G"));
        System.out.println(regex.validate("P0323A"));
    }
}
