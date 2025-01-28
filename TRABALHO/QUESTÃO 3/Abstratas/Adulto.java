package Abstratas;

public class Adulto extends Ingresso{
	public Adulto(String tipo, double precoBase) {
        super(tipo, precoBase);
    }

    @Override
    public double calcularPreco() {
        return getpBase();
    }
}
