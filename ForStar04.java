
import java.util.Scanner;
public class ForStar04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요: ");
        System.out.print(">>>");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print(' ');

            }
            for (int j = number ; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println("");
        }

        scanner.close();
    }
}
