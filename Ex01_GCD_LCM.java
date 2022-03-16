package ex01;
import java.util.Scanner;
public class Ex01_GCD_LCM {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		//최대 공약수 gcd / 최소 공배수 lcm / 나머지 nmg / 큰 수 big / 작은 수 small
		long gcd = 0;	
		long lcm = 0;
		long nmg = 0;
		long big = 0;
		long small = 0;
		
		System.out.println("첫번째 정수를 입력하세요 :");
		long m = scanner.nextInt();
		System.out.println("두번째 정수를 입력하세요 :");
		long n = scanner.nextInt();
		
		// 큰 수와 작은 수를 정한다
		if(n > m) {
			small = m;
			big = n;
		}
		else {
			big = m;
			small = n;
		}
		
		while(true) {
			long mok = big/small;
			nmg = big-mok*small;
		
			if (nmg == 0) {  // big 나누기 small 의 나머지가 0 이되면 while문 벗어남
				gcd = small;
				lcm = (long)(m*n / gcd);
				System.out.println("최대공약수 = " + gcd);
				System.out.print("최소공배수 = " + lcm);
				break;
			}

				big = small;
				small = nmg;
		}	

		scanner.close();
	}
}

