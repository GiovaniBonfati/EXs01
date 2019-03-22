import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		
		Scanner ler = new  Scanner(System.in);
		
		int vet[] = new int[5];
		int a,b;
		
		for ( a=0; a<=4; a++ ) {
			
			System.out.println("Digite o número desejado: ");
			vet[a]= ler.nextInt();
		}
		
		for ( b=0; b<=4; b++ ) {
			
			System.out.println(vet[b]);
			
			
		}	
	}
}
