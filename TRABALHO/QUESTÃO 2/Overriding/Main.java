package Overriding;

public class Main {
    public static void main(String[] args) {
    	double vIngresso = 20;
        Pessoa crianca = new Crianca(vIngresso);  
        Pessoa adulto = new Adulto(vIngresso);   

        crianca.comprarIngresso();
        adulto.comprarIngresso();
    }
}