import java.util.Random;
import java.util.Scanner;

public class Chapter17 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(10);
        boolean pass = false;
        
        while (!pass) {
            System.out.println("Guess a random number");
            int guess = myscanner.nextInt();

            if (answer == guess) {
                System.out.println("The number is correct!!!! Good boy!");
                pass = true;
            } else if (answer < guess) {
                System.out.println("The number is too high... try again");
            } else {
                System.out.println("The number is too low.... try again");
            }
        }

        myscanner.close();
    }
}
