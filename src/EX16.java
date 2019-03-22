import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		
		
	Scanner ler = new Scanner(System.in);
	
	int  vet[] = new int[10];
	int a,b;
		
	for ( a = 0; a <=9; a++) {
		
		System.out.println("Digite o número desejado: ");
		vet[a]= ler.nextInt();
	}

	for ( b = 9; b >= 0; b--) {
			
		System.out.println(vet[b]);
	}

		

	}

}
