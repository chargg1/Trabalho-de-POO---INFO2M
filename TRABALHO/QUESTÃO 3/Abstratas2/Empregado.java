package Abstratas2;

public class Empregado extends Salário{
	private double comissao;
	
	public Empregado (String emprego, double salario, double comissao) {
		super (emprego, salario);
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return getSalario() + comissao;
	}
}
