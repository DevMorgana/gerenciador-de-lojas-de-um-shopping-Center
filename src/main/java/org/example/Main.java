package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da loja: ");
                    String nomeLoja = scanner.nextLine();

                    System.out.print("Quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();

                    System.out.print("Salário base dos funcionários: ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Endereço - Nome da rua: ");
                    String nomeDaRua = scanner.nextLine();

                    System.out.print("Endereço - Cidade: ");
                    String cidade = scanner.nextLine();

                    System.out.print("Endereço - Estado: ");
                    String estado = scanner.nextLine();

                    System.out.print("Endereço - País: ");
                    String pais = scanner.nextLine();

                    System.out.print("Endereço - CEP: ");
                    String cep = scanner.nextLine();

                    System.out.print("Endereço - Número: ");
                    String numero = scanner.nextLine();

                    System.out.print("Endereço - Complemento: ");
                    String complemento = scanner.nextLine();

                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

                    System.out.print("Data de fundação - Dia: ");
                    int diaFundacao = scanner.nextInt();

                    System.out.print("Data de fundação - Mês: ");
                    int mesFundacao = scanner.nextInt();

                    System.out.print("Data de fundação - Ano: ");
                    int anoFundacao = scanner.nextInt();
                    scanner.nextLine();

                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
                    break;

                case 2:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Data de validade - Dia: ");
                    int diaValidade = scanner.nextInt();

                    System.out.print("Data de validade - Mês: ");
                    int mesValidade = scanner.nextInt();

                    System.out.print("Data de validade - Ano: ");
                    int anoValidade = scanner.nextInt();
                    scanner.nextLine();

                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            if (produto != null) {
                Data dataReferencia = new Data(20, 10, 2023);
                if (produto.estaVencido(dataReferencia)) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }
                produto = null;
            }

            if (loja != null) {
                System.out.println(loja);
                loja = null;
            }
        }

        scanner.close();
    }
}