package prac;


import java.util.Scanner;

    public class MaintainWordPositionButReverseStringContent {
        public static void main(String[] args) {
            String str = "anu is into qa";
            String reverseword = "";


            String arr[] = str.split(" ");

            for(String ssr: arr){
                StringBuilder revWord = new StringBuilder(ssr) ;
                revWord= revWord.reverse();
                reverseword=reverseword+" "+revWord;
            }

            System.out.println(reverseword.trim());




        }
}
