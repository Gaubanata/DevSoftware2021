package ui;

import java.util.Scanner;

public class Principal {

	public static void main(String array[]) {
		montaTelaPrincipal();
	}

	private static void montaTelaPrincipal() {
		clearScreen();
		System.out.println("\f SISTEMA FARMACEUTICO FARMUNC\n\n\n");
		System.out.println("1. CADASTROS");
		System.out.println("2. ESTOQUE");
		System.out.println("3. RELATORIOS");
		System.out.println("4. AJUDA");
		System.out.println("5. SAIR\n\n\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		irTela(op);
	}

	private static void irTela(Integer op) {
		if (op == 1) {
			irMenuCadastro();
		}
	}

	private static void irMenuCadastro() {
		clearScreen();
		System.out.println("\f CADASTROS\n\n\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO ");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n\n\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 5) {
			montaTelaPrincipal();
		}
	}

	public final static void clearScreen() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}