package prac;
import java.util.Scanner;

class AgeLimitException extends Exception{
    AgeLimitException(String message){
        super(message);
    }
}

public class  checkAgeClass{
    public static void main(String[] args) {

        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int  age= sc.nextInt();
        try{
            if(age<=18){
                throw new AgeLimitException("you are under age, cannot vote");
            } else{System.out.println("access granted to vote");}}
            catch(AgeLimitException e){
                System.out.println( "Exception caught "+e.getMessage());
            }
            sc.close();

    }
}

