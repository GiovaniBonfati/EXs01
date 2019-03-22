import java.util.Scanner;

public class EX18 {

	public static void main(String[] args) {
		int a,b;
		int lervet,mostrarvet;
		int aux;
		int vet[] = new int[10];
		
		Scanner ler = new Scanner (System.in);
		
		for ( lervet= 0; lervet<10; lervet++ ){
			System.out.println("Digite um número: ");
			vet[lervet]=ler.nextInt();
		}
		
		for ( a= 0; a < 10; a++ ){
				for ( b=0; b < 10; b++){
				
				if (vet[a] < vet[b]){
					
					aux=vet[b];
					vet[b]=vet[a];
					vet[a]=aux;
				
				}
			}
				
		}
		
		for ( a = 0; a < 10; a++ ){
		
			System.out.println(vet[a]);
		}

	}

}
