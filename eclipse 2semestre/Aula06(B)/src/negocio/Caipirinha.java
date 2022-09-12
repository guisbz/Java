package negocio;

public class Caipirinha extends Drink implements Mixer {
	
	public void misturar() {
		super.adicionar(new Ingrediente("Cacha�a", 50, "ml"));
		super.adicionar(new Ingrediente("A��car", 10, "g"));
		super.adicionar(new Ingrediente("Lim�o", 2, "unidades"));
		super.adicionar(new Ingrediente("Gelo", 5, "pedras"));
	}

}
