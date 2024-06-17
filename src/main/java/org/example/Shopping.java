package org.example;

import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int qtdMaxLoja) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdMaxLoja];
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipoLoja) {
                    case "Cosmético":
                        if (loja instanceof Cosmetico) {
                            count++;
                        }
                        break;
                    case "Vestuário":
                        if (loja instanceof Vestuario) {
                            count++;
                        }
                        break;
                    case "Bijuteria":
                        if (loja instanceof Bijuteria) {
                            count++;
                        }
                        break;
                    case "Alimentação":
                        if (loja instanceof Alimentacao) {
                            count++;
                        }
                        break;
                    case "Informática":
                        if (loja instanceof Informatica) {
                            count++;
                        }
                        break;
                    default:
                        return -1; // Retorna -1 se o tipo não for válido
                }
            }
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        int segMaisCaro = -1;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                segMaisCaro = i;
                break;
            }
        }
        if (segMaisCaro == -1) return null;

        for (int i = segMaisCaro + 1; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaAtual = (Informatica) lojas[i];
                Informatica lojaMaisCara = (Informatica) lojas[segMaisCaro];
                if (lojaAtual.getSeguroEletronicos() > lojaMaisCara.getSeguroEletronicos()) {
                    segMaisCaro = i;
                }
            }
        }
        return (Informatica) lojas[segMaisCaro];
    }

    @Override
    public String toString() {
        return "##### Informações sobre o Shopping #####\n" +
                "Nome: " + nome + "\n" +
                "Endereço: " + endereco + "\n" +
                "Lojas: " + Arrays.toString(lojas);
    }
}
