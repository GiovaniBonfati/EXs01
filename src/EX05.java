import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		Scanner LerVariavel = new Scanner(System.in);		
		System.out.println("1 - Venda a Vista no dinheiro Desconto de 12%");
		System.out.println("2 - Venda a vista no d�bito Desconto de 3%");
		System.out.println("3 - 1x no cart�o de cr�dito Mesmo Pre�o");
		System.out.println("4 - 3x vezes com juros no cart�o de cr�dito Acr�scimo de 5%");
		System.out.println("5 - 6x no cart�o de cr�dito Acr�scimo de 10%");
		System.out.println ("Digite op��o da compra:");
		int opcao = LerVariavel.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Venda a Vista no dinheiro Desconto de 12%");
			break;
		case 2:
			System.out.println("Venda a vista no d�bito Desconto de 3%");	
			break;
		case 3:
			System.out.println("1x no cart�o de cr�dito Mesmo Pre�o");	
			break;
		case 4:
			System.out.println("3x vezes com juros no cart�o de cr�dito Acr�scimo de 5%");	
			break;
		case 5:
			System.out.println("6x no cart�o de cr�dito Acr�scimo de 10%");
			break;
			default:
		
		}
	}
}

