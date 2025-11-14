package projetofinaljava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;

        do {

            System.out.println("============ Menu Oficina ============");
            System.out.println("1 - Cadastrar Peca");
            System.out.println("2 - Cadastrar Servico");
            System.out.println("3 - Imprimir Servicos (Tela e txt)");
            System.out.println("4 - Sair");
            System.out.println("======================================");
            System.out.print("=> Opcao: ");

            Scanner lsOpcao = new Scanner(System.in);
            opcao = lsOpcao.nextInt();

            switch (opcao) {
                case 1:
                    Peca.Cadastrar();
                    break;
                case 2:
                    Servico.Cadastrar();
                    break;
                case 3:
                    Servico.Imprimir();
                    break;
            }

        } while (opcao != 4);

    }

}