package Pessoas;

public class Bolsista extends Aluno {

  private double bolsa;
  
  public Bolsista (String cpf, String nome, int idade, int matricula, double bolsa) {

    super(cpf, nome, idade, matricula);
    this.bolsa = bolsa;
    
  }


  public void pagarMensalidade() {
    System.out.println();
  }
}
