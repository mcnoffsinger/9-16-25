import java.util.Scanner;
import java.util.Date;


public class MenuRep {

    public static Scanner scanner = new Scanner(System.in);

    
    
    //calendar.setTime(currentDate)

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();

    }
    
    public static void main(String[] args) {
        Date currentDate = new Date();
        int input;
        do{
            System.out.println("This is a menu. \n1 = say hello\n2 = display current time\n3 = exit");
            input = getIntInput("\t--> ");
            switch(input){
                case 1:
                System.out.println("Hello");//Sorry I did random stuff last time
                break;
                case 2:
                System.out.println(currentDate);//I feel bad
                break;
                case 3:
                System.out.println("Exiting menu");
                break;
                

                default:
                break;

            }

        }while(input != 3);
    }
}
