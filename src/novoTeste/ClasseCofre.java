package novoTeste;

import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(String tipo, String metodoAbertura, int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico(String tipoCofre, String metodoAbertura) {
    super("Cofre Fisico", "Chave");
  }

}

public class ClasseCofre {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);

    String tipoCofre = scanner.nextLine();
    //String metodoAbertura = scanner.nextLine();
    //String metodoAbertura = scanner.nextLine();

    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      int confirmacaoSenha = scanner.nextInt();
      //scanner.nextLine(); // Consume a quebra de linha
      String metodoAbertura = "Senha";
      CofreDigital cofreDigital = new CofreDigital(tipoCofre, metodoAbertura, senha);
      boolean senhaCorreta = cofreDigital.validarSenha(senha);
      
      // Use o objeto cofreDigital para imprimir informações
      cofreDigital.imprimirInformacoes();

      if (senha == confirmacaoSenha) {
        System.out.println("Cofre aberto!");
      } else {
        System.out.println("Senha incorreta!");
      }
    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      //CofreFisico cofreFisico = new CofreFisico(tipoCofre, metodoAbertura);
      // Use o objeto cofreFisico para imprimir informações
      //cofreFisico.imprimirInformacoes();
      System.out.println("Tipo: Cofre Fisico");
      System.out.println("Metodo de abertura: Chave");
    }
  }
}
