package controleFluxo;

import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) throws ParametrosInvalidosException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		
		contar(parametroUm, parametroDois);
		
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lancar a excecao
		try {

            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Certifique-se de fornecer dois números inteiros como parâmetros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
		
		
	}
	


