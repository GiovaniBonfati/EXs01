import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		Scanner LerVariavel = new Scanner(System.in);		
		System.out.println("1 - Venda a Vista no dinheiro Desconto de 12%");
		System.out.println("2 - Venda a vista no débito Desconto de 3%");
		System.out.println("3 - 1x no cartão de crédito Mesmo Preço");
		System.out.println("4 - 3x vezes com juros no cartão de crédito Acréscimo de 5%");
		System.out.println("5 - 6x no cartão de crédito Acréscimo de 10%");
		System.out.println ("Digite opção da compra:");
		int opcao = LerVariavel.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Venda a Vista no dinheiro Desconto de 12%");
			break;
		case 2:
			System.out.println("Venda a vista no débito Desconto de 3%");	
			break;
		case 3:
			System.out.println("1x no cartão de crédito Mesmo Preço");	
			break;
		case 4:
			System.out.println("3x vezes com juros no cartão de crédito Acréscimo de 5%");	
			break;
		case 5:
			System.out.println("6x no cartão de crédito Acréscimo de 10%");
			break;
			default:
		
		}
	}
}

