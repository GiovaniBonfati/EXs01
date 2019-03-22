import java.util.Scanner;

public class EX01RF {

	public static void main(String[] args) {
		int a = lerEntradaDoUsuario("Digite o primeiro n�mero");
		int b = lerEntradaDoUsuario("Digite o segundo n�mero");

		compararNumeros(a, b);
	}

	private static void compararNumeros(int a, int b) {
		if (a > b) {
			System.out.println("Maior n�mero: " + a);
		} else {
			System.out.println("Maior n�mero: " + b);
		}
	}

	private static int lerEntradaDoUsuario(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		return scanner.nextInt();
	}
}
