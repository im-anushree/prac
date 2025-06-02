import java.util.ArrayList;
import java.util.Scanner;

public class primeNumers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("number Entered is:" + num);
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                al.add(i);
            }}
            if (!al.isEmpty()) {
                System.out.println("num is not prime, the num are divisible by:" + al);
            } else {
                System.out.println("num is  prime");
            }




    }
}
