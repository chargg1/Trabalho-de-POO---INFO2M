package Overriding;

public class Adulto extends Pessoa {
    Adulto(double precoIngresso) {
        super(precoIngresso); // 100%
    }

    @Override
    void comprarIngresso() {
        System.out.println("Adulto comprou um ingresso por R$" + precoIngresso);
    }
}