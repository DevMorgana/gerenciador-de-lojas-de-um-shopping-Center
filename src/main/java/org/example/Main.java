package org.example;


public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        System.out.println("## MENU ##:");

        while (opcao != 3) {
            System.out.println("\nSelecione a opção desejada:");
            opcao = Teclado.leInt("(1) Criar uma loja\n(2) Criar um produto\n(3) Sair");

            switch (opcao) {
                case 1:
                    System.out.println("\n### Criação de Loja ###");

                    String nomeLoja = Teclado.leString("Digite o nome da loja: ");
                    int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários: ");
                    double salarioBaseFuncionario = Teclado.leDouble("Digite o salário base dos funcionários (ou -1 se não houver): ");
                    int quantMaxProdutos = Teclado.leInt("Digite a quantidade máxima de produtos: ");

                    String rua = Teclado.leString("Digite a rua: ");
                    String cidade = Teclado.leString("Digite a cidade: ");
                    String estado = Teclado.leString("Digite o estado: ");
                    String cep = Teclado.leString("Digite o CEP: ");
                    String pais = Teclado.leString("Digite o país: ");
                    String numero = Teclado.leString("Digite o número: ");
                    String complemento = Teclado.leString("Digite o complemento: ");
                    Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                    int diaFundacao = Teclado.leInt("Digite o dia de fundação: ");
                    int mesFundacao = Teclado.leInt("Digite o mês de fundação: ");
                    int anoFundacao = Teclado.leInt("Digite o ano de fundação: ");
                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                    Loja loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantMaxProdutos);

                    System.out.println("\nLoja criada com sucesso!");
                    System.out.println(loja);

                    break;

                case 2:
                    System.out.println("\n### Criação de Produto ###");

                    String nomeProduto = Teclado.leString("Digite o nome do produto: ");
                    double precoProduto = Teclado.leDouble("Digite o preço do produto: ");

                    int diaValidade = Teclado.leInt("Digite o dia de validade: ");
                    int mesValidade = Teclado.leInt("Digite o mês de validade: ");
                    int anoValidade = Teclado.leInt("Digite o ano de validade: ");
                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                    Produto produto = new Produto(nomeProduto, precoProduto, dataValidade);

                    System.out.println("\nProduto criado com sucesso!");
                    System.out.println(produto);

                    Data dataAtual = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataAtual)) {
                        System.out.println("\nPRODUTO VENCIDO");
                    } else {
                        System.out.println("\nPRODUTO NÃO VENCIDO");
                    }

                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}