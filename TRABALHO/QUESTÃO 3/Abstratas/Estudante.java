package Abstratas;

public class Estudante extends Ingresso{
	private double desconto;

    public Estudante(String tipo, double precoBase, double desconto) {
        super(tipo, precoBase);
        this.desconto = desconto;
        
    }

    @Override
    public double calcularPreco() {
        return getpBase() - (getpBase() * desconto);
    }
}
