import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {

		System.out.println("1 - Soma");
		System.out.println("2 - Divisão");
		System.out.println("3 - Subtração");
		System.out.println("4 - Multiplicação");

		Scanner LerOpcao = new Scanner(System.in);
		System.out.println("Digita a Opção Desejada:");
		int opcao = LerOpcao.nextInt();
		Scanner LerNum = new Scanner(System.in);
		int num, num2;
		switch (opcao) {

		case 1:
			System.out.println("Você selecionou Soma");
			System.out.println("Digite um número:");
			num = LerOpcao.nextInt();
			System.out.println("Mais:");
			num2 = LerOpcao.nextInt();
			System.out.println("Resultado: " + (num + num2));
			break;
		case 2:
			System.out.println("Você selecionou Divisão");
			System.out.println("Digite um número:");
			num = LerNum.nextInt();
			System.out.println("Divido Por:");
			num2 = LerNum.nextInt();
			System.out.println("Resultado: " + (num / num2));
			break;
		case 3:
			System.out.println("Você selecionou Subtração");
			System.out.println("Digite um número:");
			num = LerNum.nextInt();
			System.out.println("Subtraido Por:");
			num2 = LerNum.nextInt();
			System.out.println("Resultado: " + (num - num2));
			break;
		case 4:
			System.out.println("Você selecionou Multiplicação");
			System.out.println("Digite um número:");
			num = LerNum.nextInt();
			System.out.println("Multiplicado Por:");
			num2 = LerNum.nextInt();
			System.out.println("Resultado: " + (num * num2));
			break;
		default:

		}
		}
	}

