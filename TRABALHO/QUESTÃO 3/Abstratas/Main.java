package Abstratas;

public class Main {
	public static void main(String[] args) {
        
        Ingresso Estudante = new Estudante("Show da Olivia Rodrigo (Estudante)", 1000, 0.5);
        Ingresso Adulto = new Adulto("Show da Olivia Rodrigo (Adulto)", 1000);

        Estudante.exibirDetalhes();
        Adulto.exibirDetalhes();
    }
}
