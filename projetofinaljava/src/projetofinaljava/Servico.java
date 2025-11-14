package projetofinaljava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        public static void Imprimir() {
            
        String conteudo = "";
        String nomeArquivo = "servicos.txt";
;

        System.out.println("Código\t\tServiço\t\tPreço");
        
        for (int linha = 0; linha < listaServicos.length; linha++) {

            if (listaServicos[linha][0] != null) {
                for (int coluna = 0; coluna < listaServicos[linha].length; coluna++) {
                    
                    System.out.print(listaServicos[linha][coluna] + "\t\t");
                }
                

                System.out.println("");
                System.out.println("--------------------------------------");
            }
            
            conteudo += listaServicos[linha][0] + "\t"
                      + listaServicos[linha][1] + "\t"
                      + listaServicos[linha][2] + "\t"
                      + listaServicos[linha][3] + "\n";

        }
        File arquivo = new File("servicos.txt") ;

        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
            }

           
            try (PrintWriter writer = new PrintWriter(new FileWriter(arquivo, false))) {
                writer.print(conteudo);
                System.out.println("--> Conteudo escrito com sucesso no arquivo");
            }

        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo" + nomeArquivo);
        }


    }
}
