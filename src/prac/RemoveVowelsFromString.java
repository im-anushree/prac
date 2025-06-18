package prac;

public class RemoveVowelsFromString {
    public static void main(String[] args){
        String str = "aaejdksionu";
        StringBuilder withoutVowels = new StringBuilder();
        StringBuilder vowelsFound = new StringBuilder();

        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(!"aeiouAEIOU".contains(String.valueOf(c))){
                withoutVowels.append(c);
            }else{
                vowelsFound.append(c);
            }
        }
System.out.println("without vowels: "+withoutVowels.toString());
        System.out.println(" vowels removed: "+vowelsFound.toString());

    }
}
