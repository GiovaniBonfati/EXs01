import java.util.Scanner;

public class EX17 {

	public static void main(String[] args) {
		
		int a,b,aux;
		int vet[] = new int[10];
		boolean rep=true;
		boolean troca=true;
		
		Scanner ler = new Scanner(System.in);
		for ( a= 0; a<10; a++ ){
			System.out.println("Digite um número: ");
			rep=true;
			troca=true;
			while ( rep != false){
			 aux= ler.nextInt();
			 
				for ( b=0; b<10; b++ ){
				
					if ( aux == vet[b] ){
						System.out.println("O número digitado não deve ser igual!!");
						rep=true;
						break;
					}
					if ( aux != vet[b]){
						rep=false;
						troca=false;
					}
				}
				
			if ( troca == false ) {
				vet[a]=aux;
			}
			
			}
		}

	}

}
