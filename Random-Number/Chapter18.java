
import java.util.Random;
import java.util.Scanner;

public class Chapter18 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(10);
        int guesses = 0;
        boolean pass = false;
        
        while (!pass) {
            System.out.println("Guess a random number");
            int guess = myscanner.nextInt();
            guesses++;

            if (answer == guess) {
                System.out.println("The number is correct!!!! Good boy!");
                pass = true;
            } else if (answer < guess) {
                System.out.println("The number is too high... your balls will be sacrificed");
            } else {
                System.out.println("The number is too low.... your balls will be sacrificed");
            }
        }

        System.out.println("you guesssed for a grand total of " + guesses + " times");

        myscanner.close();
    }
}
