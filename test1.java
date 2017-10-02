import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        if (v1 >= 60) {
            System.out.println("及格");
        }
        if (v1 < 59) {
            System.out.println("不及格");
        }
    }
}
