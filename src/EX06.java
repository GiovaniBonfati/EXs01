import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {

		System.out.println("1 - Soma");
		System.out.println("2 - Divis�o");
		System.out.println("3 - Subtra��o");
		System.out.println("4 - Multiplica��o");

		Scanner LerOpcao = new Scanner(System.in);
		System.out.println("Digita a Op��o Desejada:");
		int opcao = LerOpcao.nextInt();
		Scanner LerNum = new Scanner(System.in);
		int num, num2;
		switch (opcao) {

		case 1:
			System.out.println("Voc� selecionou Soma");
			System.out.println("Digite um n�mero:");
			num = LerOpcao.nextInt();
			System.out.println("Mais:");
			num2 = LerOpcao.nextInt();
			System.out.println("Resultado: " + (num + num2));
			break;
		case 2:
			System.out.println("Voc� selecionou Divis�o");
			System.out.println("Digite um n�mero:");
			num = LerNum.nextInt();
			System.out.println("Divido Por:");
			num2 = LerNum.nextInt();
			System.out.println("Resultado: " + (num / num2));
			break;
		case 3:
			System.out.println("Voc� selecionou Subtra��o");
			System.out.println("Digite um n�mero:");
			num = LerNum.nextInt();
			System.out.println("Subtraido Por:");
			num2 = LerNum.nextInt();
			System.out.println("Resultado: " + (num - num2));
			break;
		case 4:
			System.out.println("Voc� selecionou Multiplica��o");
			System.out.println("Digite um n�mero:");
			num = LerNum.nextInt();
			System.out.println("Multiplicado Por:");
			num2 = LerNum.nextInt();
			System.out.println("Resultado: " + (num * num2));
			break;
		default:

		}
		}
	}

