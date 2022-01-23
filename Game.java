import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("What is your guess? ");
            String guess = myObj.nextLine();
            int guessInt = Integer.parseInt(guess);
            if (guessInt < randInt) {
                    System.out.println("Higher");
                }
            else if (guessInt > randInt) {
                    System.out.println("Lower");
                }
            else {
                    System.out.println("You Win!");
                    break;
            }
        }
    }
}
