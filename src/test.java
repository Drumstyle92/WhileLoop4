import java.util.Random;
import java.util.Scanner;

/**
 * @author Drumstyle92
 * class that contains the program.
 */
public class test {
    /**
     * @param args main parameter.
     * main method that contains two int variables, a while loop and its output.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // random number
        int number;
        // user number
        int used;

        System.out.println("Welcome!");
        // While loop
        do{
            Random random = new Random();
            number = random.nextInt(10) + 1;
            used = scanner.nextInt();
            System.out.println("Guess the random number");
        }while(used != number);{
            System.out.println("Congratulations!");
        }
    }
}
