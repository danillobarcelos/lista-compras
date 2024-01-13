package lista_terminal;


import java.util.Scanner;

import lista_compras.Item;
import lista_compras.ListaCompras;

public class ListaComprasTerminal {
	
	ListaCompras lista = new ListaCompras();

	public ListaComprasTerminal() {
	 	System.out.println("Bem vindo(a) a Lista de Compras!");
		System.out.println("Deseja iniciar uma nova lista?");
		System.out.println("1- Não");
		System.out.println("2- Sim");
	}

	public static void iniciar(ListaCompras lista, Scanner sc) {
		System.out.println("Seja bem vindo(a)");
		System.out.println("Para iniciar, digite o nome da sua lista:");
		lista.nome = sc.next();
		
		ListaComprasTerminal.menu(lista, sc);
	}
	
	public static void menu(ListaCompras lista, Scanner sc) {
		System.out.println("Selecione o que deseja realizar");
		System.out.println("1- Adicionar item | 2- Remover item | 3 - Exibir lista | 4 - Sair");
		int opc = 0;
		
		opc = sc.nextInt();

		
		switch(opc) {
			
		case 1:
			ListaComprasTerminal.adicionar(lista, sc);
			ListaComprasTerminal.menu(lista, sc);
			break;
		case 2:
			ListaComprasTerminal.remover();
			break;
		case 3:
			ListaComprasTerminal.exibirLista();
			break;
		case 4:
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}

	public static void adicionar(ListaCompras lista, Scanner sc) {
		Item item = new Item();
		item.nome = sc.next();
		item.quantidade = sc.nextInt();
		item.descricao = sc.next();
		lista.adicionar(item);
	}

	private static void exibirLista() {
		// TODO Auto-generated method stub
		
	}

	private static void remover() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	// CRIAR UM MENU COM CHAMADA PARA TODA VEZ QUE ADICIONAR UM ITEM RETORNAR NELE
		
}
