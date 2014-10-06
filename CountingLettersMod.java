import java.util.Scanner;

public class CountingLettersMod {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String userString;
        String userSearch;
        char userChar;
        int count = 0;
        
        
        System.out.print("Enter some text > ");
        userString = keyboard.nextLine();
        System.out.print("What letter would you like to search for? > ");
        userSearch = keyboard.nextLine();
        userChar = userSearch.charAt(0);
        
        for (int index = 0; index < userString.length(); index++) {
            if (Character.toLowerCase(userString.charAt(index)) == userChar) {
                count++;
            }
        }
        System.out.println("There were " + count + " letter \"" + 
                           Character.toUpperCase(userChar) + "'s\" in your text.");
    }
}