import java.util.Scanner;

public class CountingLetters {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String userString;
        int count = 0;
        
        System.out.print("Enter some text > ");
        userString = keyboard.nextLine();
        
        for (int index = 0; index < userString.length(); index++) {
            if (Character.toLowerCase(userString.charAt(index)) == 'e') {
                count++;
            }
        }
        System.out.println("There were " + count + " letter \"E's\" in your text.");
    }
}