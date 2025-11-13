package projetofinaljava;

import java.util.Scanner;

/**
 * Classe responsavel por gerenciar matriz lista que contem as peças
 *
 * @author Mayko Amaral
 */
public class Peca {

    static String nome;
    static int codigo = 0;
    static String[][] listaPecas = new String[10][2];

    /**
     * Este metodo cadastra uma nova peça na matriz de peças.
     */
    public static void Cadastrar() {

        System.out.println("--------------------------------------");
        System.out.print("=> Nome da Peca: ");
        Scanner lsNome = new Scanner(System.in);
        nome = lsNome.nextLine();

        listaPecas[codigo][0] = Integer.toString(codigo + 1);
        listaPecas[codigo][1] = nome;

        codigo++;

        System.out.println("=> A peca " + nome + " foi cadastrada com sucesso!");
        System.out.println("--------------------------------------");

    }
}
