package projetofinaljava;

import java.util.Scanner;

/**
 * Classe responsável por gerenciar matriz lista de serviços.
 *
 * @author Mayko Amaral
 */
public class Servico {

    static int codigo = 0;
    static String descricao;
    static double valor = 0;
    static int codigoPeca = 0;
    static String[][] listaServicos = new String[100][4];

    /**
     * Este metodo responsável por cadastrar um novo serviço na matriz de listaServicos.
     */
    public static void Cadastrar() {

        if (Peca.listaPecas[0][0] != null) {

            System.out.println("--------------------------------------");
            System.out.print("=> Descricao do servico: ");
            Scanner lsdescricao = new Scanner(System.in);
            descricao = lsdescricao.nextLine();

            System.out.print("=> Valor do servico: ");
            Scanner lsValor = new Scanner(System.in);
            valor = lsValor.nextDouble();

            System.out.println("===== Lista de pecas disponiveis =====");
            Peca.Listar();
            System.out.print("=> Codigo da peca do servico: ");
            Scanner lsCodigoPeca = new Scanner(System.in);
            codigoPeca = lsCodigoPeca.nextInt();

            listaServicos[codigo][0] = Integer.toString(codigo + 1);
            listaServicos[codigo][1] = descricao;
            listaServicos[codigo][2] = Double.toString(valor);
            listaServicos[codigo][3] = Integer.toString(codigoPeca);

            codigo++;

            System.out.println("=> O servico foi cadastrado com sucesso!");
            System.out.println("--------------------------------------");

        } else {
            System.out.println("--------------------------------------");
            System.out.println("Antes de cadastrar um serviço, eh necessario cadastrar uma peca primeiro.");
        }
    }
}
