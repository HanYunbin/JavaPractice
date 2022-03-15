package ex01;
import java.util.Scanner;
public class ScannerStar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오.>>");	
		int number = scanner.nextInt();
		
		for(int i = 0; i <number; i ++) {
			
			
			for(int j = 0; j<(number*2)-1; j ++) {
				
			if ( i==number -1|| (i + j) == number -1 || (i+ (number -1))==j)
				System.out.print("*");
			else
				System.out.print(" ");
				
			}
			System.out.print('\n');
		}
		scanner.close();
}
}