package teste;

import lista_compras.Item;
import lista_compras.ListaCompras;

public class TesteListaAdicionarRemover {

	public static void main(String[] args) {
		ListaCompras listaTeste = new ListaCompras();
		Item arroz = new Item("Arroz", 2, "Teste");
		Item feijao = new Item("Feijão", 4, "Feijão gostoso demais!");
		
		listaTeste.adicionar(arroz);
		listaTeste.adicionar(feijao);
	//	listaTeste.exibir();
		
		listaTeste.remover(feijao);
	//	listaTeste.exibir();
		listaTeste.remover(arroz);
		listaTeste.exibir();
		
		
		
	}
}
