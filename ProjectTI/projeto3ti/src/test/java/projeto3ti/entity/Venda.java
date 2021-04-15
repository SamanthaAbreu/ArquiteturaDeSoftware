package projeto3ti.entity;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
		List<Item> itens = new ArrayList <Item>();
	
	
	public boolean addItem (Item item) {
		itens.add(item);
		return true;
	}

}
