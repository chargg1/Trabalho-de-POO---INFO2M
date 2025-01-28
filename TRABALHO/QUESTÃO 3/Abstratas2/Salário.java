package Abstratas2;

public abstract class Salário {
	private String emprego;
	private double salario;
	
	public Salário (String emprego, double salario) {
		this.emprego = emprego;
		this.salario = salario;
	}
	
	public String getEmprego() {
		return emprego;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public abstract double calcularSalario();
	
	public void exibirDetalhes() {
        System.out.println("Seu trabalho é de " + emprego + ", o valor do salário R$" + calcularSalario());
    }
}
