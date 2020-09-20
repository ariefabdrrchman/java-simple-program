import java.util.Scanner;

public class CoinToss {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("welcome to guess the coin game");
        System.out.print("your guess (1 or 0) : ");
        int guess = userInput.nextInt();

        while (guess != 0 && guess != 1) {
            System.out.println("\ninput is invalid, your input should be either 1 or 0");
            System.out.print("your new input : ");
            guess = userInput.nextInt();
        }

        int coin = (int) Math.abs(Math.round(Math.random() * 10)) % 2;
        System.out.println("\ncoin : " + coin);

        if (coin == guess) {
            System.out.println("your guess is right, you won !\nthanks for playing");
        } else {
            System.out.println("your guess is wrong, you lose !\nthanks for playing");
        }

    }

}