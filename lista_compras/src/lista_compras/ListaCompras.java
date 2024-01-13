package lista_compras;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
	public List<Item> lista = new ArrayList<Item>();
	public Item item;
	public String nome;
	
	public void adicionar(Item item) {
		lista.add(item);
	}
	
	public void remover(Item item) {
		lista.remove(item);
	}
	
	public void exibir() {
		for (Item item : lista) {
			System.out.println("Item: " + item.nome + " Qtd: " + item.quantidade
					+ " Descrição: " + item.descricao);
			}
	}

	
	
	
}
