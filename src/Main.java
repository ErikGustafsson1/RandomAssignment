import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        RandomNumberGen randomNumberGen = new RandomNumberGen();
        while(!randomNumberGen.isCorrect)
        {
            System.out.println("Guess on a number.");
            guess = scanner.nextInt();
            int i =  randomNumberGen.randomLogic(guess);
            switch (i)
            {
                case 1:
                    System.out.println("Guess a higher number");
                    break;
                case 2:
                    System.out.println("Guess a lower number");
                default:
                    System.out.println("You guessed the correct number!");
            }

        }
    }
}
