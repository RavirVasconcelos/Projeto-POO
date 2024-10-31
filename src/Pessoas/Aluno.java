package Pessoas;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno (String cpf, String nome, int idade, int matricula) {

        super(cpf, nome, idade);
        this.matricula = matricula;

    }
}
