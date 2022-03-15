package ex01;

public class NestedLoop {
	public static void main(String[] args) {
		
		
		for(int i =0; i<10; i++) {
			for(int j=2; j<10; j++) {
				if (i == 0)
					System.out.print(j+"단");
				else
				System.out.print(j + "*" + i + "=" + i*j);
				System.out.print('\t');
			}
				System.out.println();
			
		}

	}

}
