import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		
		
		boolean repeticao=true;	
		int soma=0;

		while (repeticao != false) {
			Scanner ler = new Scanner(System.in);
			int num = ler.nextInt();
			soma = soma + num;
			if ( num == 0 ) {
				repeticao = false;
				System.out.println("Programa finalizado!");
			}
			System.out.println("Resultado: "+soma);
		}
		
		
	}

}
