import java.util.Scanner;
import Pessoas.Pessoa;
import Pessoas.Aluno;
import Pessoas.Visitante;
import Pessoas.Professor;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = null;


        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite o Nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Tipo da Pessoa: (Visitante, Aluno, Professor)");
        String tipoPessoa = sc.nextLine();

        if (tipoPessoa.equalsIgnoreCase("Visitante")) {

            pessoa = new Visitante(cpf, nome, idade);

        }
        else if (tipoPessoa.equalsIgnoreCase("Aluno")) {

            System.out.print("Matricula: ");
            int matricula = sc.nextInt();
            sc.nextLine();

            pessoa = new Aluno(cpf, nome, idade, matricula);

            System.out.println("Aluno Bolsista ou Regular?");
            System.out.println("1 - Bolsista");
            System.out.println("2 - Regular");
            int tipoAluno = sc.nextInt();
            sc.nextLine();

            if (tipoAluno == 1) {

                double bolsa = 800.0;

                Aluno aluno = new Bolsista(cpf, nome, idade, matricula, bolsa);
            }

        }
        else if (tipoPessoa.equalsIgnoreCase("Professor")) {

            pessoa = new Professor(cpf, nome, idade);

        }
        else {

            System.out.println("Tipo invalido");

        }

        if (pessoa != null) {

            System.out.println();
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Idade: " + pessoa.getIdade());
        }
    }
}
