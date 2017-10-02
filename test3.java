import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if (ch - 'A' >= 0 && ch - 'A' < 26) {
            System.out.println(Character.toLowerCase(ch));
        } else {
            if (ch - 'a' >= 0 && ch - 'a' < 26) {
                System.out.println(Character.toUpperCase(ch));

            }
        }
    }
}