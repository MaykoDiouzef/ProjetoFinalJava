package projetofinaljava;

import java.util.Scanner;

/**
 * Classe responsável por gerenciar matriz lista de peças.
 *
 * @author Mayko Amaral
 */
public class Peca {

    static String nome;
    static int codigo = 0;
    static String[][] listaPecas = new String[100][2];

    /**
     * Este metodo responsável por cadastrar uma nova peça na matriz listaPecas.
     */
    public static void Cadastrar() {

        System.out.println("--------------------------------------");
        System.out.print("=> Nome da peca: ");
        Scanner lsNome = new Scanner(System.in);
        nome = lsNome.nextLine();

        listaPecas[codigo][0] = Integer.toString(codigo + 1);
        listaPecas[codigo][1] = nome;

        codigo++;

        System.out.println("=> A peca " + nome + " foi cadastrada com sucesso!");
        System.out.println("--------------------------------------");

    }

    /**
     * Este metodo responsável por listar a matriz listaPecas.
     */
    public static void Listar() {
        
        System.out.println("Codigo\t\tPeca");

        for (int linha = 0; linha < listaPecas.length; linha++) {

            if (listaPecas[linha][0] != null) {
                for (int coluna = 0; coluna < listaPecas[linha].length; coluna++) {
                    System.out.print(listaPecas[linha][coluna] + "\t\t");
                }

                System.out.println("");
                System.out.println("--------------------------------------");
            }

        }
    }
}
