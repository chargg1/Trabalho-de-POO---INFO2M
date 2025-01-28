package Overriding;

public class Pessoa {
	double precoIngresso;

    Pessoa(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    void comprarIngresso() {
        System.out.println("O valor do ingresso é de R$" + precoIngresso);
    }
}