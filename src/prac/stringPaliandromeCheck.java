package prac;

public class stringPaliandromeCheck {

        public static void main(String[] args) {
            String input = "madam";
            StringBuilder sb = new StringBuilder(input);
            if (input.equals(sb.reverse().toString())) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }


