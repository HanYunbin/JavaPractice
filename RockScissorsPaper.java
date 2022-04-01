package ex02;
import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
	while(true) {
		
		System.out.println ("<<가위, 바위, 보 게임>>");
		System.out.println ("0) 가위, 1) 바위, 2) 보");
		System.out.println ("선택하세요 : ");
		
		int RockSissorsPaper = scanner.nextInt();
		int computer = rnd.nextInt(3);
//		String Rock = "바위"; // 1
//		String Scissors = "가위"; //0
//		String Paper = "보"; // 2
		if (computer == 0) {
		System.out.println("computer : 가위");
		}
		else if (computer == 1) {
			System.out.println("computer : 바위");
			}
		else if (computer == 2) {
			System.out.println("computer : 보");
			}
		
		if(RockSissorsPaper == 0) {
			
				System.out.print("당신 : 가위");
				
				if (computer == 0) {
				System.out.println("비겼습니다.");}
				else if (computer == 1) {
					System.out.println("졌습니다.");}
				else if (computer == 2) {
					System.out.println("이겼습니다.");}
		}
		else if (RockSissorsPaper == 1) {
			System.out.println("당신 : 바위");
			if (computer == 1) {
				System.out.println("비겼습니다.");}
				else if (computer == 2) {
					System.out.println("졌습니다.");}
				else if (computer == 0) {
					System.out.println("이겼습니다.");}
		}
			
		else if (RockSissorsPaper == 2) {
			System.out.println("당신 : 보");
			if (computer == 2) {
				System.out.println("비겼습니다.");}
				else if (computer == 0) {
					System.out.println("졌습니다.");}
				else if (computer == 1) {
					System.out.println("이겼습니다.");}
		}

		System.out.println("1) 다시하기, 2) 끝내기");
		int end = scanner.nextInt();
		if (end == 1){
			continue;
		}
		else if (end == 2){
			break;
		}
		scanner.close();
	}
	}
}


