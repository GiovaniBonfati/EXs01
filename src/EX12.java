import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		boolean A=true;
		
		int num=0,num2=0;
		Scanner ler = new Scanner(System.in);
		
		while ( A == true ) {
		num = ler.nextInt();
			if ( num > 0  &&  num < 11){
			A=false;	
			System.out.println("Multiplos de "+num+":");
			
				for ( int B = 0; B < 1000; B++ ) {
					
					if ( B % num == 0 ) {
						System.out.println("Numero: "+B);
						
					}
				}
			}
		}
		
		A=true;
		
		while ( A == true ) {
		num2 = ler.nextInt();
		
			if ( num2 > 0  &&  num2 < 11){
			A=false;	
			System.out.println("Multiplos de "+num2+":");
				for ( int B = 0; B < 1000; B++ ) {
					if ( B % num2 == 0 ) {
						System.out.println("Numero: "+B);
						
					}
				}
			}
		}

	}

}
