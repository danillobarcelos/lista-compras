package teste;

import lista_compras.Item;

public class TesteItem {

	public static void main(String[] args) {
	//	Item item = new Item();
	//	item.nome = "arroz";
	//	item.descricao ="arroz branco 5kg";
	//	System.out.println(item.nome + " " + item.descricao);
		
		Item item2 = new Item("feijao", 1, "feijao carioca");
		System.out.println(item2.nome + " " + item2.descricao);
	}
}
