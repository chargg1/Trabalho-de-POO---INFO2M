package Interfaces1;

public class Crianca implements Falar, Andar {
	int idade;
	
	Crianca (int idade){
		this.idade = idade;	
	}
	
	@Override
	public void falar() {
		if (idade > 2) {
			System.out.println("A criança está falando algo!!!");
		}else {
			System.out.println("A criança não sabe falar ainda!!");
		}
	}
		
	@Override 
	public void andar() {
		if (idade > 1) {
			System.out.println("A criança está andando.");
		}else {
			System.out.println("A criança está engatinhando...");
		}
	}
	
}
