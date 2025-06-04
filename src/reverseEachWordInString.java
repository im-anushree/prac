import java.util.Scanner;

public class reverseEachWordInString {

   public static void main(String[] args){
       System.out.println("Enter string");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String result= "";

       String[] words = str.split(" ");
       for(int i=words.length-1;i>=0;i--){
        result=result+words[i]+" ";
       }System.out.println(result);

   }


}
