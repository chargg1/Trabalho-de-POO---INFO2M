package Interfaces2;

public class Notebook extends Informacoes{
	
		public Notebook(String marca) {
	        super(marca);
	}
	
		@Override
	public void FalarMarca() {
		System.out.println("A marca de seu notebook é " + getMarca() + ".");
	}

}
