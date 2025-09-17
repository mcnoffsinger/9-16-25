import java.util.Scanner;
public class SentinelSum{

    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();

    }


    public static void main(String[] args) {
        int total = 0;
        int user = 67;//so apparently the variable needs to have a value in order for it to be used in loops
        while(user != 0){
            user = getIntInput("Please enter an integer, typing 0 will escape the loop: ");
            total += user;//adds the newly entered value to the total

        }
        System.out.println(total);

    }






}