import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int num1=num;
        int fact=1;

             while(num>0){
                 int i= num;
                fact= fact*i;
                 num=i-1;

             }
             System.out.println("Factorial of "+num1+" is "+fact);
    }
}
