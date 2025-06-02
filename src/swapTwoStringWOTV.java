//swap two string without third variable

public class swapTwoStringWOTV {
    public static void main(String[] args) {
String s1= "anu";
String s2= "v";
 s1=s1+s2;// s1= anuv
s2=s1.substring(0,s1.length()-s2.length());
s1=s1.substring(s2.length());
System.out.println(s1);
System.out.println(s2);

    }
}