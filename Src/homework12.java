import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        int[] randomArray = new int[7];
        int[] attemptArray = new int[7];
        int guessedNumber = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вікторина вгадай 7 рандомних чисел!");
        for (int i = 0; i < 7; i++) {
            randomArray[i] = random.nextInt(9);
        }
        System.out.println("Введіть числа від 0 до 9 включно");
        for (int i = 0; i < 7; i++) {
            attemptArray[i] = scanner.nextInt();
            if (attemptArray[i] > 9) {
                i--;
                System.out.println("Ви ввели невірну число! Введіть число від 0 до 9.");
            }
        }
        Arrays.sort(attemptArray);
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(attemptArray));
        System.out.println(Arrays.toString(randomArray));
        for (int i = 0; i < 7; i++) {
            if (randomArray[i] == attemptArray[i]) {
                guessedNumber++;
            }
        }
        if (guessedNumber == 0) {
            System.out.println("Нажаль ви не вгадали ні одного числа, спробуйте, ще раз!");
        } else {
            System.out.println("Ви вгадали: " + guessedNumber + " чисел із 7!");

        }
    }
}
