import java.util.Scanner;
public class HashStairs{

    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();

    }
    public static String getChara(String prompt) {
        System.out.print(prompt);
        return Character.toString(scanner.nextLine().trim().charAt(0));//so you can't cast a char to an int but you can do this? Makes sense.

    }


    public static void main(String[] args) {// IT WORKED FIRST TRY HOLY ####
        String notCharacterTotallyNotaCharacterThisisaString = getChara("please enter a character to make a staircase with: ");
        int ten = getIntInput("Please enter an integer to generate stairs: ");
        String output = "";
        for (int i=1;i<=ten;i++){
            for (int j = ten-i;j>0;j--){
                output += " ";

            }
            for(int j = i;j>0;j--){
                output += notCharacterTotallyNotaCharacterThisisaString;
            }
            System.out.println(output);
            output = "";
        }
    }
}