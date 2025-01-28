package Overloading;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();

        Aluno aluno1 = new Aluno("Ewerton Souza", 100, "Informática");
        Aluno aluno2 = new Aluno("Giácomo Gabriel", 101, "Informática");
        Aluno aluno3 = new Aluno("Estéffany Tavares", 102, "Informática");

    
        escola.addAluno(aluno1);
        escola.addAluno(aluno2);
        escola.addAluno(aluno3);

        System.out.println("Buscando pelo nome:");
        escola.buscarInformações("Ewerton Souza");

        System.out.println("\nBuscando pela matrícula:");
        escola.buscarInformações(101);

        System.out.println("\nBuscando aluno inexistente:");
        escola.buscarInformações("João");
        escola.buscarInformações(104);
    }
}
