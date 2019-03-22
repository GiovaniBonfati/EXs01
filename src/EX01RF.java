import java.util.Scanner;

public class EX01RF {

	public static void main(String[] args) {
		int a = lerEntradaDoUsuario("Digite o primeiro número");
		int b = lerEntradaDoUsuario("Digite o segundo número");

		compararNumeros(a, b);
	}

	private static void compararNumeros(int a, int b) {
		if (a > b) {
			System.out.println("Maior número: " + a);
		} else {
			System.out.println("Maior número: " + b);
		}
	}

	private static int lerEntradaDoUsuario(String string) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número:");
		return scanner.nextInt();
	}
}
