import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int A,B;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número:");
		A = ler.nextInt();		
		Scanner ler2 = new Scanner(System.in);
		System.out.println("Digite o segundo número");
		B = ler2.nextInt();
		
		if ( A > B) {
			
			System.out.println("Maior número: "+A);
		
		}else {
			
			System.out.println("Maior número: "+B);
			
		}	
		
	}


}
