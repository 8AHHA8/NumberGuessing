import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Random();
        Random random = new Random();
        int NumberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuessed = false;

        while(!wasNumberGuessed){
            System.out.println("podaj liczbe: ");
            int userNumber = scanner.nextInt();

            if(userNumber < NumberToGuess){
                System.out.println("liczba jest za mala");
            }
            else if(userNumber > NumberToGuess){
                System.out.println("liczba jest za duza");
            }
            else{
                System.out.println("w sam raz^^");
                break;
            }
        }

    }

}
