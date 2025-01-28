package Interfaces2;

public abstract class Informacoes implements Ligar, Desligar{
	private String marca;
    private boolean ligado;

    public Informacoes(String marca) {
        this.marca = marca;
        this.ligado = false;
    }
    
    public String getMarca() {
        return marca;
    }
    
    @Override
    public void ligar() {
    	if (!ligado) {
            ligado = true;
            System.out.println("O notebook da marca " + marca + " está ligado.");
        } else {
            System.out.println("O notebook já está ligado.");
        }
    }
    
    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O notebook da marca " + marca + " está desligado.");
        } else {
            System.out.println("O notebook já está desligado.");
        }
    }
    
   public abstract void FalarMarca();
}
