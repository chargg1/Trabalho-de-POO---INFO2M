package Abstratas2;

public class Main {

	public static void main(String[] args) {
		Salário Empregado = new Empregado ("Assistente administrativo", 1200, 200);
		Salário Aprendiz = new Aprendiz ("Assistente administrativo", 1200, 250);
		
		Empregado.exibirDetalhes();
		Aprendiz.exibirDetalhes();

	}

}
