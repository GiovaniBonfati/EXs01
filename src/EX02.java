import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
	
		
		int A,B;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		A = ler.nextInt();
		Scanner ler2 = new Scanner (System.in);
		System.out.println("Digite o segundo n�mero");
		B = ler2.nextInt();
		
		if (A < B) {
			
			System.out.println("O menor n�mero �: "+A);
	
		}else{
			
			System.out.println("O menor n�mero �:"+B);
		}
			
	}

}
