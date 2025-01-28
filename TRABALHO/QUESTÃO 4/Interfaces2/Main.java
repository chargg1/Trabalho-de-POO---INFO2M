package Interfaces2;

public class Main {

	public static void main(String[] args) {
		Notebook Lenovo = new Notebook("Lenovo");
		Notebook Samsung = new Notebook("Samsung");
		
		Lenovo.ligar();
		Lenovo.FalarMarca();
		Samsung.ligar();
		Samsung.FalarMarca();
	}

}
