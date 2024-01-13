package lista_terminal;

import java.util.Scanner;

import lista_compras.ListaCompras;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			new ListaComprasTerminal();
			System.out.println("Digite a opção desejada: ");
			
			int inputInicial = sc.nextInt();
			
			switch(inputInicial) {
			case 1: 
				System.out.println("Até mais!");
				break;
			case 2:
				ListaComprasTerminal.iniciar(new ListaCompras(), sc);
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			
	}
			
	sc.close();
	}
}
