package Abstratas;

public abstract class Ingresso {
	private String tipo;
	private double precoBase;
	
    public Ingresso(String tipo, double precoBase) {
        this.tipo = tipo;
        this.precoBase = precoBase;
    }

    public String getTipo() {
        return tipo;
    }
    
    public double getpBase () {
    	return precoBase;
    }

    public abstract double calcularPreco();

    public void exibirDetalhes() {
        System.out.println("Ingresso: " + tipo + " - Preço: R$" + calcularPreco());
    }
}
