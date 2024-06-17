package org.example;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public boolean estaVencido(Data dataRecebida) {
        if (dataRecebida.getAno() < dataValidade.getAno()) {
            return false;
        } else if (dataRecebida.getAno() == dataValidade.getAno()) {
            if (dataRecebida.getMes() < dataValidade.getMes()) {
                return false;
            } else if (dataRecebida.getMes() == dataValidade.getMes()) {
                return dataRecebida.getDia() > dataValidade.getDia();
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Informações do Produto:\n" +
                "Nome do produto: " + nome + "\n" +
                "Preço do produto: " + preco + "\n" +
                "Data de Validade: " + dataValidade;
    }
}