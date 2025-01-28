package Abstratas2;

public class Aprendiz extends Salário{
private double comissao;
private double salarioReduzido = 600;
	
	public Aprendiz (String emprego, double salario, double comissao) {
		super (emprego, salario);
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return (getSalario() + comissao) - salarioReduzido;
	}
}

