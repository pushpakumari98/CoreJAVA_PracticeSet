import java.util.Random;
import java.util.*;  //import java.util.Scanner
public class RockPaperScissorGame {
    public static void main(String[] args) {
//     int rock=0;
//     int paper=1;
//     int scissor=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("0 is for rock");
        System.out.println("1 is for paper");
        System.out.println("2 is for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) ;
        System.out.println("draw");

        if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1)
        {
            System.out.println("you win!");
        } else
        {
            System.out.println("Computer win!");
        }
//        System.out.println("computer choice: "+ computerInput);
        if(computerInput==0) {
            System.out.println("computer choice: rock");
        }
        else if(computerInput==1) {
            System.out.println("computer choice: paper");
        }
        else if(computerInput==2) {
            System.out.println("computer choice: scissors");
        }
    }
}

