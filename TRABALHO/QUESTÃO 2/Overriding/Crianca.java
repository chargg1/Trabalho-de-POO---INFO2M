package Overriding;

public class Crianca extends Pessoa {
    Crianca(double precoIngresso) {
        super(precoIngresso * 0.5); // 50%
    }

    @Override
    void comprarIngresso() {
        System.out.println("Criança comprou um ingresso por R$" + precoIngresso);
    }
}