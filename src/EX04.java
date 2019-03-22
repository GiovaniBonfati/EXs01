import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println ("Digite 3 números:");
		int A = ler.nextInt();
		int B = ler.nextInt();
		int C = ler.nextInt();
		
		if((A > B) & (B > C)) {
			
			System.out.println( C + " " + B + " " + A);
		}
		
		if((A > C) & (C > B)){
			
			System.out.println( A + " " + C + " " + B);
		}
		if((C > B) & (B > A)){
			
			System.out.println( A + " " + B + " " + C);			
		}
						
		if((C > A) & (A > B)){
			
			System.out.println( B + " " + A + " " + C);
		}
		if((B > A) & (A > C)) {
			
			System.out.println( C + " " + A + " " + B);
		}
		if((B > C) & (C > A)) {
			
			System.out.println(" " + A + " " + C + " " + B);
		}						
	}
}
