import java.util.Scanner;

public class MenuRep {

    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();

    }
    
    public static void main(String[] args) {
        int input;
        do{
            System.out.println("This is a menu. \nPress 1 to make text gray\nPress 2 to make text blue\nPress 3 to make text green\nPress 4 to make text pink\nPress 5 to exit menu");
            input = getIntInput("\t--> ");
            switch(input){
                case 1:
                System.out.println("\u001B[30m");//So I looked this up
                break;
                case 2:
                System.out.println("\u001B[34m");//They're basically escape characters like \n or \t
                break;
                case 3:
                System.out.println("\u001B[32m");//They use ANSI color codes
                break;
                case 4:
                System.out.println("\u001B[35m");//This wasn't ChatGPT
                break;
                case 5:
                System.out.println("closing menu");

                default:
                break;

            }

        }while(input != 5);
    }
}
